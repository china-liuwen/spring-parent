package com.factorybean;

import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个是用工厂配置的 有点麻烦不怎么用的
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factoryBean.xml");
        EmployeeService employeeService = context.getBean("empFactory",EmployeeService.class);
        int result = employeeService.add(5,3);
        System.out.println(result);
    }
}
