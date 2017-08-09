package services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/8/2.
 */
@WebServlet(name = "checkImgServlet")
public class checkImgServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String str=request.getParameter("yzm");

        HttpSession session = request.getSession();
        String rand= (String)session.getAttribute("rand");

        String b="ok";
        if(str.equals(rand)){
            b = "ok";
        }
        else {
            b = "no";
        }

        out.println(b);

        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
