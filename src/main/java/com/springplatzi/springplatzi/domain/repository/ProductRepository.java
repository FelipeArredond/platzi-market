package com.springplatzi.springplatzi.domain.repository;

import com.springplatzi.springplatzi.domain.PurchaseItem;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<PurchaseItem.Product> getAll();
    Optional<List<PurchaseItem.Product>> getByCategory(int categoryId);
    Optional<List<PurchaseItem.Product>> getScarseProducts(int cantidad);
    Optional<PurchaseItem.Product> getProduct(int productId);
    PurchaseItem.Product save(PurchaseItem.Product product);
    void delete(int productId);
}
