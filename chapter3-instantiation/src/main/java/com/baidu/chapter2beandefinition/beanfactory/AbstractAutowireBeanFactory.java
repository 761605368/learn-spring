package com.baidu.chapter2beandefinition.beanfactory;

import com.baidu.chapter2beandefinition.beandefiniton.BeanDefinitionRegistry;
import com.baidu.chapter2beandefinition.entity.BeanDefinition;
import com.baidu.chapter2beandefinition.instantiationStrategy.InstantiationStrategy;
import com.baidu.chapter2beandefinition.instantiationStrategy.impl.CglibInstantiationStrategy;
import com.baidu.chapter2beandefinition.instantiationStrategy.impl.JdkInstantiationStrategy;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lxh
 * @date 2023/2/20 22:49
 */
public abstract class AbstractAutowireBeanFactory extends AbstractBeanFactory {

    InstantiationStrategy instantiationStrategy = new JdkInstantiationStrategy();

    @SneakyThrows
    @Override
    protected Object creatBean(String beanName, BeanDefinition beanDefinition, Object... args) {
        Object instance = newInstance(beanName, beanDefinition, args);
        registrySingleton(beanName, instance);

        return instance;
    }

    @SneakyThrows
    protected Object newInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Class clazz = beanDefinition.getClazz();

        Class[] classes = Arrays.stream(args).map(Object::getClass).collect(Collectors.toList()).toArray(new Class[0]);
        Constructor constructor = clazz.getDeclaredConstructor(classes);

        return instantiationStrategy.instance(clazz, constructor, args);
    }


}
