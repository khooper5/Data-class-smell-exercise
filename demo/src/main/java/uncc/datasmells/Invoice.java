package uncc.datasmells;

public class Invoice {

    private final String invoiceId;
    private final Order order;
    private final double taxRate;
    private final double discount;

    public Invoice(String invoiceId, Order order, double taxRate, double discount) {
        
        // Validation
        if(invoiceId == null || invoiceId.trim().isEmpty()){
            throw new IllegalArgumentException("Invoice ID cannot be null or empty");
        }
        if(order == null){
            throw new IllegalArgumentException("Order cannot be null");
        }
        if(taxRate < 0){
            throw new IllegalArgumentException("Tax rate cannot be negative");
        }

        if(discount < 0){
            throw new IllegalArgumentException("Discount cannot be negative");
        }
        this.invoiceId = invoiceId;
        this.order = order;
        this.taxRate = taxRate;
        this.discount = discount;

        
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public Order getOrder() {
        return order;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getDiscount() {
        return discount;
    }   

    // Helper methods
    public boolean hasDiscount() {
        return discount > 0;
    }

    // Business logic methods
    public double calculateSubtotal() {
        return order.calculateSubtotal();
    }
    public double calculateTaxAmount() {
        return order.calculateSubtotal() * taxRate;
    }
    public double calculateTotal() {
        double subtotal = order.calculateSubtotal();
        double taxAmount = subtotal * taxRate;
        return subtotal + taxAmount - discount;
    }

    @Override
    public String toString() {
        return "Invoice{invoiceId='" + invoiceId + "', order=" + order +
                ", taxRate=" + taxRate + ", discount=" + discount + "}";
    }
}