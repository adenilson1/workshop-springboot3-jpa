package com.adl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
