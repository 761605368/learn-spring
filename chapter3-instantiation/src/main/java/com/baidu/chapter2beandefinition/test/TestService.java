package com.baidu.chapter2beandefinition.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxh
 * @date 2023/2/20 22:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestService {

    private String name = "default";

    /**
     * 得到名字
     *
     * @return {@link String}
     */
    public String getName() {
        return name;
    }
}
