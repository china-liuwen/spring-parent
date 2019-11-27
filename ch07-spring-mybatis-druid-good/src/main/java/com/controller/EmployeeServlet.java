package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());

        EmployeeService service = context.getBean("employeeService",EmployeeService.class);
        Employee employee = service.getById();

        req.setAttribute("emp", employee);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
