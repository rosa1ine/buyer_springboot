package com.farmapp.buyer.service;

import com.farmapp.buyer.model.Product;
import com.farmapp.buyer.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Product> filterByCategory(String category) {
        return productRepository.findByCategory_NameIgnoreCase(category);
    }

    public List<Product> filterByLocation(String location) {
        return productRepository.findByFarmLocationContainingIgnoreCase(location);
    }

    public List<Product> filterByPriceRange(Double minPrice, Double maxPrice) {
        return productRepository.findByPriceRange(minPrice, maxPrice);
    }
}
