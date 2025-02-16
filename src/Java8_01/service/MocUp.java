package Java8_01.service;

import Java8_01.model.Order;

import java.util.ArrayList;
import java.util.List;

public class MocUp {
    public static List<Order> orderList() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Laptop", "Abc", "Dell", 10, 45000.00));
        orders.add(new Order(2, "Mobile", "Electronics", "Samsung", 20, 15000.00));
        orders.add(new Order(3, "TV", "LG", "Sony", 5, 45000.00));
        orders.add(new Order(4, "AC", "Electronics", "LG", 15, 35000.00));
        orders.add(new Order(5, "Washing Machine", "Electronics", "Whirlpool", 10, 25000.00));
        orders.add(new Order(6, "Refrigerator", "Electronics", "Samsung", 10, 35000.00));
        return orders;
    }
}
