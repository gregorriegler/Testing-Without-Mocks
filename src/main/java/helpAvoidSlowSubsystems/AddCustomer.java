package helpAvoidSlowSubsystems;

public class AddCustomer {

    private final CustomerDatabase db;

    public AddCustomer(CustomerDatabase db) {
        this.db = db;
    }

    public void add(String name) {
        if (isEmpty(name)) throw new IllegalArgumentException();
        Customer customer = new Customer(name);
        db.add(customer);
    }

    private boolean isEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
