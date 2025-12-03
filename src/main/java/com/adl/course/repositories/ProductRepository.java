package com.adl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
