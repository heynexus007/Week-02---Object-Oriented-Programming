package com.mutlilevelinheritance.retailorder;

public class DeliveredOrder extends ShippedOrder {
    int deliveryDate;
    DeliveredOrder(int orderId, int orderDate, int trackingNumber, int deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    void getOrderStatus() {
        System.out.println("----Order Details----");
        System.out.println("Order Id : "+ orderId);
        System.out.println("Order Date : "+ orderDate);
        System.out.println("Tracking Number : "+ trackingNumber);
        System.out.println("Delivery Date : "+deliveryDate);
    }
}
