package com.example.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		ProductModel p1 = new ProductModel(null, "Monitor Aoc 27", 1600.0);
		ProductModel p2 = new ProductModel(null, "RTX-4060", 4400.0);
		ProductModel p3 = new ProductModel(null, "Dell G15", 6500.0);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
	}
}
