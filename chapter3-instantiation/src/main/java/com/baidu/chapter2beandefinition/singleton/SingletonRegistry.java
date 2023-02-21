package com.baidu.chapter2beandefinition.singleton;

/**
 * @author li
 */
public interface SingletonRegistry {


    /**
     * 获取单例
     *
     * @param beanName bean名字
     * @return {@link Object}
     */
    Object getSingleton(String beanName);


}
