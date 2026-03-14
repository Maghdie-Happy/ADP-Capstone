package za.ac.cput.domain;

public class Order {

    private String orderId;
    private String orderDate;
    private String status;
    private double totalAmount;
    private String customerId;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.orderDate = builder.orderDate;
        this.status = builder.status;
        this.totalAmount = builder.totalAmount;
        this.customerId = builder.customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public static class Builder {

        private String orderId;
        private String orderDate;
        private String status;
        private double totalAmount;
        private String customerId;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOrderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}