package help_avoid_slow_subsystems;

public interface CustomerDatabase {
    void add(Customer customer);

    boolean contains(Customer customer);
}
