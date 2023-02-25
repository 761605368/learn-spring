package com.baidu.chapter2beandefinition;

import com.baidu.chapter2beandefinition.beanfactory.impl.DefaultListBeanFactory;
import com.baidu.chapter2beandefinition.dao.TestDao;
import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import com.baidu.chapter2beandefinition.entity.BeanReference;
import com.baidu.chapter2beandefinition.entity.Properties;
import com.baidu.chapter2beandefinition.test.TestService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Chapter2BeandefinitionApplicationTests {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class BeanReferenceImpl implements BeanReference {
        private String beanName;
        @Override
        public String getBeanName() {
            return beanName;
        }
    }


    @Test
    void contextLoads() {
        DefaultListBeanFactory beanFactory = new DefaultListBeanFactory();
        beanFactory.registryBeanDefinition("testDao", new BeanDefinition("testDao", TestDao.class));
        List<Properties> propertiesList = new ArrayList<>();
        propertiesList.add(new Properties("testDao", new BeanReferenceImpl("testDao")));
        propertiesList.add(new Properties("count", 10111));
        beanFactory.registryBeanDefinition("testService", new BeanDefinition("testService", TestService.class, propertiesList));
        TestService testService = (TestService) beanFactory.getBean("testService");
        System.out.println("testService.getName() = " + testService.getName());
        System.out.println("testService.getCount() = " + testService.getCount());

        TestService testService2 = (TestService) beanFactory.getBean("testService");
        System.out.println("testService.getName() = " + testService2.getName());

    }

}
