package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl service = context.getBean("employeeService",EmployeeServiceImpl.class);
        service.insert();
        System.out.println("=====================");
        service.update();
    }
}
