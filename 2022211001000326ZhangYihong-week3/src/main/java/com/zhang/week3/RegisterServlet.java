package com.zhang.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.println("ID:2022211001000326");
        writer.println("username:Zhang");
        writer.println("password:123");
        writer.println("email:2798028766@qq.com");
        writer.println("gender:male");
        writer.println("birthday:2004-07-28");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ID = request.getParameter("ID");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");

        PrintWriter writer = response.getWriter();
        writer.println("<h2>Submitted Data:</h2>");
        writer.println("<p>ID: " + ID + "</p>");
        writer.println("<p>Username: " + username + "</p>");
        writer.println("<p>Password: " + password + "</p>");
        writer.println("<p>Email: " + email + "</p>");
        writer.println("<p>Gender: " + gender + "</p>");
        writer.close();
    }
}
