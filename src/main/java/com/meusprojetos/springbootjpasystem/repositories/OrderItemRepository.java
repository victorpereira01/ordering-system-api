package com.meusprojetos.springbootjpasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.springbootjpasystem.entities.OrderItem;
import com.meusprojetos.springbootjpasystem.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}