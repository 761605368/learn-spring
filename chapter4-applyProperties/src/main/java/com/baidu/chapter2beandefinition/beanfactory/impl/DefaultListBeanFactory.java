package com.baidu.chapter2beandefinition.beanfactory.impl;

import com.baidu.chapter2beandefinition.beandefiniton.BeanDefinitionRegistry;
import com.baidu.chapter2beandefinition.beanfactory.AbstractAutowireBeanFactory;
import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lxh
 * @date 2023/2/20 22:53
 */
public class DefaultListBeanFactory extends AbstractAutowireBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap();

    @Override
    public Object registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        return beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }
}
