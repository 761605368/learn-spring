package com.baidu.chapter2beandefinition;

import com.baidu.chapter2beandefinition.beanfactory.impl.DefaultListBeanFactory;
import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import com.baidu.chapter2beandefinition.test.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter2BeandefinitionApplicationTests {

    @Test
    void contextLoads() {
        DefaultListBeanFactory beanFactory = new DefaultListBeanFactory();
        beanFactory.registryBeanDefinition("testService", new BeanDefinition("testService", TestService.class));
        TestService testService = (TestService) beanFactory.getBean("testService");
        System.out.println("testService.getName() = " + testService.getName());

        TestService testService2 = (TestService) beanFactory.getBean("testService");
        System.out.println("testService.getName() = " + testService2.getName());

    }

}
