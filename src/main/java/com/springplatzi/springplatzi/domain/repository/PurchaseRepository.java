package com.springplatzi.springplatzi.domain.repository;

import com.springplatzi.springplatzi.domain.Purchase;
import com.springplatzi.springplatzi.domain.PurchaseItem;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
