package org.alvarowau.ejercicio1;

import org.alvarowau.ejercicio1.model.Order;
import org.alvarowau.ejercicio1.model.enums.OrderStatus;


public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(101, "Laptop", 999.99, OrderStatus.PENDING);
        System.out.println(order1.printOrderDetails());

        Order order2 = new Order(102, "Smartphone", 699.99, OrderStatus.SHIPPED);
        System.out.println(order2.printOrderDetails());

        Order order3 = new Order(103, "Headphones", 49.99, OrderStatus.DELIVERED);
        System.out.println(order3.printOrderDetails());

        // Actualizando los estados de las órdenes
        order1.updateStatus(OrderStatus.CANCELLED);
        order2.updateStatus(OrderStatus.DELIVERED);
        order3.updateStatus(OrderStatus.SHIPPED);

        System.out.println("Ordenes cambiadas:");
        System.out.println(order1.printOrderDetails());
        System.out.println(order2.printOrderDetails());
        System.out.println(order3.printOrderDetails());
    }
}
