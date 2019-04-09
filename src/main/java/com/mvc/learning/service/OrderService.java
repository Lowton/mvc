package com.mvc.learning.service;

import com.mvc.learning.domain.Order;

import java.util.List;

public interface OrderService {

    void save(Order order);

    void delete(Order order);

    List<Order> getAll();

    Order getById(Integer id);
}
