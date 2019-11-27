package com;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean("employeeService",EmployeeService.class);

        List<Employee> emps = service.getAll(2,3);
        for (Employee emp:emps){
            System.out.println("emp = " + emp);
        }
    }
}
