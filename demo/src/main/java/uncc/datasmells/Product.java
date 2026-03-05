package uncc.datasmells;

public class Product {

    private final String id;
    private final String name;
    private final double price;

    public Product(String id, String name, double price) {

        // Validation
        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        
        if(price < 0){
            throw new IllegalArgumentException("Product price cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + "}";
    }
}