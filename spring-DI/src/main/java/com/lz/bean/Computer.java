package com.lz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LY
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Computer {
    /**
     * 电脑的品牌
     */
    private String brand;
    /**
     * 电脑的价格
     */
    private Float price;
}
