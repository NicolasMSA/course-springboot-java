package com.example.course.repositories;

import com.example.course.entities.OrderItem;
import com.example.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRespository extends JpaRepository<OrderItem, Long>{

}
