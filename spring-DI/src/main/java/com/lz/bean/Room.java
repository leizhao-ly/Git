package com.lz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LY
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Room {
    private Computer computer;
    private String roomId;
}
