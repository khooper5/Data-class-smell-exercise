package uncc.datasmells;

public class Customer {

    private final String id;
    private final String name;
    private final String email;

    public Customer(String id, String name, String email) {

        // Validation
        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Customer email must be valid");
        }
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    
@Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', email='" + email + "'}";
    }
}