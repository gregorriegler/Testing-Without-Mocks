package helpAvoidSlowSubsystems;

import java.util.ArrayList;
import java.util.List;

public class RealCustomerDatabase implements CustomerDatabase {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        try {
            Thread.sleep(5000);
            customers.add(customer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean contains(Customer customer) {
        return customers.contains(customer);
    }
}
