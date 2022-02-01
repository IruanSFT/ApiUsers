package com.example.sample.repository;


import com.example.sample.models.UserOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrdersRepository extends JpaRepository<UserOrders, Long>{

}
