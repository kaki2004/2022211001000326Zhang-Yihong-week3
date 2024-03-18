package com.zhang.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ID = request.getParameter("ID");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Submitted Data</title>");
        writer.println("</head>");
        writer.println("<body>");

        // 创建表格显示数据
        writer.println("<h2>Submitted Data:</h2>");
        writer.println("<table border='1'>");
        writer.println("<tr>");
        writer.println("<th>ID</th>");
        writer.println("<th>Username</th>");
        writer.println("<th>Email</th>"); // 密码通常不显示
        writer.println("<th>Gender</th>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>" + ID + "</td>");
        writer.println("<td>" + username + "</td>");
        // 隐藏密码
        // writer.println("<td>" + password + "</td>");
        writer.println("<td>" + email + "</td>");
        writer.println("<td>" + gender + "</td>");
        writer.println("</tr>");

        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
