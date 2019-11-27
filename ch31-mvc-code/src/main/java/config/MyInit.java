package config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //配置上下文
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        //注册 类
        applicationContext.register(MvcConfig.class);
        //分配器
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        //动态注册
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("asd",dispatcherServlet);
        //映射
        servletRegistration.addMapping("/");
    }
}


























