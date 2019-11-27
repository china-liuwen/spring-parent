package param;

import com.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_param.xml");
        EmployeeServiceImpl service = context.getBean("employeeService",EmployeeServiceImpl.class);

        int result = service.add(7,2);
        System.out.println(result);
    }
}
