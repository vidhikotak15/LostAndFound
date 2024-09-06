package com.example.login;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "welcomeServlet", value = "/welcome-servlet")
public class WelcomeServlet extends HttpServlet {

    public WelcomeServlet(){
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession(false);
        if(session != null) {
//            response.setContentType("text/html");
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request,response);
        }else{
            response.getWriter().write("Log in to get acccess");
            response.getWriter().print(" <a href=\"login.jsp\">Log in</a>");
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
}
