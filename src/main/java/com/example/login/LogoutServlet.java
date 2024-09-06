package com.example.login;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "logoutServlet", value = "/logout-servlet")
public class LogoutServlet extends HttpServlet {

    public LogoutServlet(){
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        session.invalidate();
    }
}