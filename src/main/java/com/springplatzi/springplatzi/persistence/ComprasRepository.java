package com.springplatzi.springplatzi.persistence;

import com.springplatzi.springplatzi.domain.Purchase;
import com.springplatzi.springplatzi.domain.repository.PurchaseRepository;
import com.springplatzi.springplatzi.persistence.crud.CompraCrudRepository;
import com.springplatzi.springplatzi.persistence.entity.Compra;
import com.springplatzi.springplatzi.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ComprasRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Override
    public List<Purchase> getAll() {
        return purchaseMapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(item -> purchaseMapper.toPurchases(item));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = purchaseMapper.toCompra(purchase);
        compra.getProductos().forEach(comprasProducto -> comprasProducto.setCompra(compra));
        return purchaseMapper.toPurchase(compraCrudRepository.save(compra));
    }
}
