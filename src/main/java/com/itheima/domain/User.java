package com.itheima.domain;

import lombok.Data;

/**
 * @author Administrator
 * @title: User
 * @projectName springboot_mybatis_plus
 * @description: TODO
 * @date 2019/8/8/000819:09
 */

@Data
public class User {
    private int id;
    private String name;
    private Integer age;
    private String email;
}
