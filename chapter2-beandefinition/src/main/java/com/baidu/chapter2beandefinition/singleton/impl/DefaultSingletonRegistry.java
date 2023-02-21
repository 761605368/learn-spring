package com.baidu.chapter2beandefinition.singleton.impl;

import com.baidu.chapter2beandefinition.singleton.SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lxh
 * @date 2023/2/20 22:29
 */
public class DefaultSingletonRegistry implements SingletonRegistry {
    Map<String, Object> singletonMap = new HashMap();

    public Object registrySingleton(String beanName, Object singletonBean) {
        return singletonMap.put(beanName, singletonBean);
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonMap.get(beanName);
    }
}
