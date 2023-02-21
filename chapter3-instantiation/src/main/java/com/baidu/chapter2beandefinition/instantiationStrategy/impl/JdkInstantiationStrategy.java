package com.baidu.chapter2beandefinition.instantiationStrategy.impl;

import com.baidu.chapter2beandefinition.instantiationStrategy.InstantiationStrategy;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;

/**
 * jdk实例化策略
 *
 * @author lxh
 * @date 2023/2/21 18:53
 */
public class JdkInstantiationStrategy implements InstantiationStrategy {
    @SneakyThrows
    @Override
    public Object instance(Class clazz, Constructor constructor, Object[] args) {

        return constructor.newInstance(args);
    }
}
