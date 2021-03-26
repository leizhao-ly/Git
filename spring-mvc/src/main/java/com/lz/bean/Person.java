package com.lz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LY
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;

}
