package com.baidu.chapter2beandefinition.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxh
 * @date 2023/2/25 14:20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private String name;

    private Object value;

}
