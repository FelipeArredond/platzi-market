package com.springplatzi.springplatzi.domain.service;

import com.springplatzi.springplatzi.domain.Purchase;
import com.springplatzi.springplatzi.domain.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(String clientId){
        return purchaseRepository.getByClient(clientId);
    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
