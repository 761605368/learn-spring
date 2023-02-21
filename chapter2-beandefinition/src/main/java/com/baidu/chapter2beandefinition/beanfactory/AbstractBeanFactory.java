package com.baidu.chapter2beandefinition.beanfactory;

import com.baidu.chapter2beandefinition.entity.BeanDefinition;
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


        return creatBean(beanDefinition);
    }

    /**
     * 创造豆
     *
     * @param beanDefinition bean定义
     * @return {@link Object}
     */
    protected abstract Object creatBean(BeanDefinition beanDefinition);

    /**
     * 得到bean定义
     *
     * @param beanName bean名字
     * @return {@link BeanDefinition}
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName);
}
