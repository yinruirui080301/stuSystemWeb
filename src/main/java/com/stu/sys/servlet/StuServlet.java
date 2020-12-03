package com.stu.sys.servlet;

import com.stu.sys.domain.Student;
import com.stu.sys.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAllStudents")
public class StuServlet extends HttpServlet {
    private StudentService studentService=new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<Student> lists=studentService.findAllStudent();
       req.setAttribute("students",lists);
       req.getRequestDispatcher("WEB-INF/myjsp/students.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
