package com;

import com.service.emp.impl.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl employeeService = context.getBean("emp",EmployeeServiceImpl.class);
        employeeService.getAll();
        employeeService.getById();
        employeeService.deleteById();
        employeeService.xxx();
    }
}
