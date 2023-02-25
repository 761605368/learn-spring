package com.baidu.chapter2beandefinition.beanfactory;

/**
 * 豆facory
 *
 * @author li
 * @date 2023/02/20
 */
public interface BeanFactory {

    /**
     * 让豆
     *
     * @param beanName bean名字
     * @return {@link Object}
     */
    Object getBean(String beanName);

    /**
     * 让豆
     *
     * @param beanName bean名字
     * @param args     arg游戏
     * @return {@link Object}
     */
    Object getBean(String beanName, Object... args);
}
