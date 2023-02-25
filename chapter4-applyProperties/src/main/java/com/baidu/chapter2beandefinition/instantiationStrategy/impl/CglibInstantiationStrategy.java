package com.baidu.chapter2beandefinition.instantiationStrategy.impl;

import com.baidu.chapter2beandefinition.instantiationStrategy.InstantiationStrategy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * cglib实例化策略
 *
 * @author lxh
 * @date 2023/2/21 18:55
 */
public class CglibInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instance(Class clazz, Constructor constructor, Object[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        return enhancer.create(constructor.getParameterTypes(), args);
    }
}
