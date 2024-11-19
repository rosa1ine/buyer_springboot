package com.farmapp.buyer.controller;

import com.farmapp.buyer.model.Product;
import com.farmapp.buyer.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")


public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String name) {
        return ResponseEntity.ok(productService.searchProductsByName(name));
    }

    @GetMapping("/filter/category")
    public ResponseEntity<List<Product>> filterByCategory(@RequestParam String category) {
        return ResponseEntity.ok(productService.filterByCategory(category));
    }

    @GetMapping("/filter/location")
    public ResponseEntity<List<Product>> filterByLocation(@RequestParam String location) {
        return ResponseEntity.ok(productService.filterByLocation(location));
    }

    @GetMapping("/filter/price")
    public ResponseEntity<List<Product>> filterByPriceRange(@RequestParam Double minPrice, @RequestParam Double maxPrice) {
        return ResponseEntity.ok(productService.filterByPriceRange(minPrice, maxPrice));
    }
}
