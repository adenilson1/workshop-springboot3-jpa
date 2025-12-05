package com.adl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
