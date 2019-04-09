package com.mvc.learning.repository;

import com.mvc.learning.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private List<Order> orders = new ArrayList<Order>();

    public OrderRepositoryImpl() {
        Order order = new Order(1,"Pizza peperoni", 234d);
        Order order2 = new Order(2,"Sushi Philadelfia", 123d);

    }

    public void save(Order order) {
        orders.add(order);
    }

    public void delete(Order order) {
        orders.remove(order);
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order getById(Integer id) {
        return orders.get(id);
    }
}
