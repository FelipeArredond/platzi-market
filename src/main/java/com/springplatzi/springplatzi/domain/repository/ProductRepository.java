package com.springplatzi.springplatzi.domain.repository;

import com.springplatzi.springplatzi.domain.service.Product;
import com.springplatzi.springplatzi.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int cantidad);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
