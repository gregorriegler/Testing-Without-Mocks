package helpAvoidSlowSubsystems;

public interface CustomerDatabase {
    void add(Customer customer);

    boolean contains(Customer customer);
}
