package com.service.impl;

import config.AnnoSupportTxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DeptServiceImplTest {

    @Test
    public void txDemo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnoSupportTxConfig.class);
        DeptServiceImpl service =  context.getBean(DeptServiceImpl.class);
        service.txDemo();
    }
}