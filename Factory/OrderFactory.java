package Factory;

import za.ac.cput.domain.Order;

public class OrderFactory {

    public static Order createOrder(String orderId,
                                    String orderDate,
                                    String status,
                                    double totalAmount,
                                    String customerId) {

        // Basic validation
        if (orderId == null || orderId.isEmpty())
            return null;

        if (customerId == null || customerId.isEmpty())
            return null;

        if (totalAmount <= 0)
            return null;

        // Build Order object
        return new Order.Builder()
                .setOrderId(orderId)
                .setOrderDate(orderDate)
                .setStatus(status)
                .setTotalAmount(totalAmount)
                .setCustomerId(customerId)
                .build();
    }
}