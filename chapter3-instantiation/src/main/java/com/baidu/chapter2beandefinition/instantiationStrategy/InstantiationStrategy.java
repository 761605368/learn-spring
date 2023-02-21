package com.baidu.chapter2beandefinition.instantiationStrategy;

import java.lang.reflect.Constructor;

/**
 * @author li
 */
public interface InstantiationStrategy {

    /**
     * 实例
     *
     * @param clazz       clazz
     * @param constructor 构造函数
     * @param args        arg游戏
     * @return {@link Object}
     */
    Object instance(Class clazz, Constructor constructor, Object[] args);
}
