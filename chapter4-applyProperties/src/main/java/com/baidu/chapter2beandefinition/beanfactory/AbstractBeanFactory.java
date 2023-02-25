package com.baidu.chapter2beandefinition.beanfactory;

import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import com.baidu.chapter2beandefinition.instantiationStrategy.InstantiationStrategy;
import com.baidu.chapter2beandefinition.instantiationStrategy.impl.CglibInstantiationStrategy;
import com.baidu.chapter2beandefinition.singleton.impl.DefaultSingletonRegistry;

/**
 * @author lxh
 * @date 2023/2/20 22:37
 */
public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {


    @Override
    public Object getBean(String beanName) {

        Object singleton = getSingleton(beanName);
        if (null != singleton) {
            return singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);


        return creatBean(beanName, beanDefinition);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        Object singleton = getSingleton(beanName);
        if (null != singleton) {
            return singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);


        return creatBean(beanName, beanDefinition, args);
    }

    /**
     * 创造豆
     *
     * @param beanDefinition bean定义
     * @param beanName       bean名字
     * @param args           arg游戏
     * @return {@link Object}
     */
    protected abstract Object creatBean(String beanName, BeanDefinition beanDefinition, Object... args);

    /**
     * 得到bean定义
     *
     * @param beanName bean名字
     * @return {@link BeanDefinition}
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName);
}
