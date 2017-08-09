package services;

import bean.Paging;
import bean.User;
import biz.Imp.LoginImp.LoginBizImp;
import biz.LoginBiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@WebServlet(name = "checkLoginServlet")
public class checkLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        //String uname = new String(request.getParameter("uname").getBytes(),"UTF-16");
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String rule = request.getParameter("r");
        User u = new User();
        u.setUsername(uname);
        u.setPassword(pwd);
        u.setRule(rule);

        LoginBiz lb = new LoginBizImp();
        if(lb.checkLogin(u)){
            if(u.getRule().equals("1")){
                session.setAttribute("admin",uname);
                session.setAttribute("rule","1");

                //分页逻辑的处理
                Paging p = new Paging(lb.userNumBiz(),1);
                p.doPaging(1);
                //将普通用户的信息查询出来
                List<User> userlist = lb.pageUsers(p.getStart(),p.getEnd());
                session.setAttribute("userlist",userlist);
                session.setAttribute("paging",p);
                response.sendRedirect("admin/admin.jsp");
            }
            else {
                session.setAttribute("currt",uname);
                response.sendRedirect("main.jsp");
            }
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
