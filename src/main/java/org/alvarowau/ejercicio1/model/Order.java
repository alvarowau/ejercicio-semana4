package org.alvarowau.ejercicio1.model;

import org.alvarowau.ejercicio1.model.enums.OrderStatus;

public class Order {

    private int orderId;
    private String productName;
    private double price;
    private OrderStatus status;

    public Order(int orderId, String productName, double price, OrderStatus status) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }


    public String printOrderDetails(){
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
