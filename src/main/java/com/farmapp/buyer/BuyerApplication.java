package com.farmapp.buyer;
import com.farmapp.buyer.repository.ProductRepository;
import com.farmapp.buyer.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BuyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(ProductRepository productRepository) {
		return args -> {
			List<Product> products = productRepository.findAll();
			System.out.println("Products: " + products);
		};
	}
}
 