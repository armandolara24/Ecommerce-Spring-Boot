package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200") // this will allow JS code running in browser to access this rest
public interface ProductRepository extends JpaRepository<Product, Long> {
}
