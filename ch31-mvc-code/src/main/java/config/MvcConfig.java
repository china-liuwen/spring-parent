package config;

import controller.MyFistInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@ComponentScan("controller")
@EnableWebMvc   // 等价于xml的mvc:annotation-driven  注解驱动
public class MvcConfig implements WebMvcConfigurer {

    //视图解析器
    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        MyFistInterceptor fistInterceptor = new MyFistInterceptor();
        InterceptorRegistration registration = registry.addInterceptor(fistInterceptor);

        //拦截所有
        registration.addPathPatterns("/**");
    }

}










































