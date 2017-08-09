package services;

import bean.Province;
import biz.Imp.ProvinceImp.ProvinceBizImp;
import biz.ProvinceBiz;

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
@WebServlet(name = "regist")
public class regist extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceBiz pb = new ProvinceBizImp();
        List<Province> ps = pb.selectProvinceBiz();

        HttpSession session = request.getSession();
        session.setAttribute("psList",ps);

        response.sendRedirect("regist.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
