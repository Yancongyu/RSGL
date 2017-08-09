package services;

import bean.City;
import biz.CityBiz;
import biz.Imp.CityImp.CityBizImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
@WebServlet(name = "selectCityServlet")
public class selectCityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid=request.getParameter("pid");
        CityBiz cb = new CityBizImp();
        List<City> list =null;

        list = cb.selectCityBiz(pid);

        HttpSession session = request.getSession();
        session.setAttribute("cList",list);

        //请求转发
        request.getRequestDispatcher("json.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
