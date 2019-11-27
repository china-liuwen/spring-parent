package com.test;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean("employeeService",EmployeeService.class);
        Employee employee = service.getById();
        System.out.println("----employee = "+employee);
    }
}
