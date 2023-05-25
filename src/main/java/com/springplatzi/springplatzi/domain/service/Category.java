package com.springplatzi.springplatzi.domain.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Category {
    private Long categoryId;
    private String category;
    private Boolean active;
}
