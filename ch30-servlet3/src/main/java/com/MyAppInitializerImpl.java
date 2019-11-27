package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyAppInitializer {
    /**
     * 动态注册方法二
     * @param sc
     */
    @Override
    public void dangQiDongShi(ServletContext sc) {
        ServletRegistration.Dynamic servletRegistration = sc.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
