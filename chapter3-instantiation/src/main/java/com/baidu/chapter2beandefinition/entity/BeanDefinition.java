package com.baidu.chapter2beandefinition.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxh
 * @date 2023/2/20 22:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanDefinition {

    private String beanName;

    private Class clazz;
}
