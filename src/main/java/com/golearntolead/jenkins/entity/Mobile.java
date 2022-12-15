package com.golearntolead.jenkins.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Mobile {

    private Integer mobileId;
    private String mobileName;
    private String modelType;
    private Integer quantity;
    private double price;

}
