package uncc.datasmells;

import java.util.List;

public class Order {

    private final String orderId;
    private final Customer customer;
    private final List<Product> products;

    public Order(String orderId, Customer customer, List<Product> products) {

        // Validation
        if(orderId == null || orderId.trim().isEmpty()){
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if(products == null || products.isEmpty()){
            throw new IllegalArgumentException("Products cannot be null or empty");
        }
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;

        
    }

    public String getOrderId() { return orderId; }

    public Customer getCustomer() { return customer; }

    public List<Product> getProducts() { return products; }


    // Helper methods
    public void addProduct(Product product) {
     products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Business logic methods
    public double calculateSubtotal() {
    double total = 0;

    for (Product product : products) {
        total += product.getPrice();
    }

    return total;
}

    @Override
    public String toString() {
        return "Order{orderId='" + orderId + "', customer=" + customer +
                ", products=" + products + "}";
    }
}