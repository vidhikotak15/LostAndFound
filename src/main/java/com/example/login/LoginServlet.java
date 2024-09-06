package com.example.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    UserDatabaseConn databaseConn = new UserDatabaseConn();

    private static final long serialVersionUID = 1L;
    HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() throws SQLException {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init()
    {
        session = null;
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        doGet(request, response);
        PrintWriter out = response.getWriter();
        String UID = request.getParameter("UID");
        String password =  request.getParameter("pword");
        try {
            if(databaseConn.login(UID, password))
            {
                session = request.getSession();
                RequestDispatcher rd = request.getRequestDispatcher("welcome-servlet");
                request.setAttribute("name", UID);
                rd.forward(request, response);

            }
            else
            {
                response.setContentType("text/html");
                response.getWriter().print("Incorrect password or username! please try again");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}