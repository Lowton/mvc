package com.mvc.learning.domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestOrder {

    @Test
    public void testOrderToString() {
        Order order = new Order(1, "title", 12.34);
        String value = "Order {id=1, title=title, price=12.34}";
        Assert.assertEquals(value,order.toString());
    }
}
