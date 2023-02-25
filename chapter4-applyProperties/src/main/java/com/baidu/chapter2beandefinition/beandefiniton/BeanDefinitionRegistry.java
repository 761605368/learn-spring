package com.baidu.chapter2beandefinition.beandefiniton;

import com.baidu.chapter2beandefinition.entity.BeanDefinition;

/**
 * bean定义注册表
 *
 * @author li
 * @date 2023/02/20
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册表bean定义
     *
     * @param BeanName       bean名字
     * @param beanDefinition bean定义
     * @return {@link Object}
     */
    Object registryBeanDefinition(String BeanName, BeanDefinition beanDefinition);
}
