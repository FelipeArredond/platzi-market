package com.springplatzi.springplatzi.domain.service;

import com.springplatzi.springplatzi.domain.PurchaseItem;
import com.springplatzi.springplatzi.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<PurchaseItem.Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<PurchaseItem.Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<PurchaseItem.Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public PurchaseItem.Product save(PurchaseItem.Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }
}
