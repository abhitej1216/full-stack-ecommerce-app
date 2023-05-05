package com.springboot.ecommerceproject.dao;

import com.springboot.ecommerceproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
