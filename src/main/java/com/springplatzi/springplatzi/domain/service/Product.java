package com.springplatzi.springplatzi.domain.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {
    private Long productId;
    private String name;
    private Long categoryId;
    private Double price;
    private Integer stock;
    private Boolean active;
    private Category category;
}
