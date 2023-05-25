package com.springplatzi.springplatzi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class PurchaseItem {
    private Long productId;
    private int quantity;
    private double total;
    private boolean active;

    @Data
    @Builder
    @AllArgsConstructor
    public static class Product {
        private Long productId;
        private String name;
        private Long categoryId;
        private Double price;
        private Integer stock;
        private Boolean active;
        private Category category;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class Category {
        private Long categoryId;
        private String category;
        private Boolean active;
    }
}
