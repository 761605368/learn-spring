package com.baidu.chapter2beandefinition.beanfactory.impl;

import com.baidu.chapter2beandefinition.beanfactory.AbstractAutowireBeanFactory;
import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import lombok.SneakyThrows;

/**
 * @author lxh
 * @date 2023/2/20 22:53
 */
public class DefaultListBeanFactory extends AbstractAutowireBeanFactory {
    @SneakyThrows
    @Override
    protected Object creatBean(BeanDefinition beanDefinition) {
        Object instance = beanDefinition.getClazz().newInstance();
        registrySingleton(beanDefinition.getBeanName(), instance);
        return instance;
    }
}
