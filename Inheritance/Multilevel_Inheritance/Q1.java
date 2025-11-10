/*Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes. */

import java.time.LocalDate;

class Order {
    protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void printSummary() {
        System.out.println("OrderId: " + orderId + ", OrderDate: " + orderDate + ", Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void printSummary() {
        System.out.println("OrderId: " + orderId + ", OrderDate: " + orderDate + ", Tracking: " + trackingNumber + ", Status: " + getOrderStatus());
    }
}

class DeliveredOrder extends ShippedOrder {
    protected LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void printSummary() {
        System.out.println("OrderId: " + orderId + ", OrderDate: " + orderDate + ", Tracking: " + trackingNumber + ", DeliveryDate: " + deliveryDate + ", Status: " + getOrderStatus());
    }
}

public class Q1 {
    public static void main(String[] args) {
        Order o1 = new Order("ORD-1001", LocalDate.of(2025, 9, 1));
        ShippedOrder o2 = new ShippedOrder("ORD-1002", LocalDate.of(2025, 9, 2), "TRK-ABC-123");
        DeliveredOrder o3 = new DeliveredOrder("ORD-1003", LocalDate.of(2025, 9, 3), "TRK-XYZ-789", LocalDate.of(2025, 9, 5));

        o1.printSummary();
        o2.printSummary();
        o3.printSummary();

        Order[] history = { o1, o2, o3, new DeliveredOrder("ORD-1004", LocalDate.now(), "TRK-NEW-555", LocalDate.now()) };
        for (Order o : history) {
            System.out.println(o.getOrderStatus());
        }
    }
}
