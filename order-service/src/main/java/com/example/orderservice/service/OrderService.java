package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto order);
    Iterable<OrderEntity> getOrdersByUserId(String userId);

    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getAllOrdersByUserId(String userId);
}
