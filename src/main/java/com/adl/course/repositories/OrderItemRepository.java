package com.adl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.course.entities.OrderItem;
import com.adl.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
