package com.lz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LY
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class User {
    private Integer uid;
    private String name;
    private String password;
}
