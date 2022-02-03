package helpAvoidSlowSubsystems;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AddCustomerTest {

    @Test
    void slow_infrastructure() {
        CustomerDatabase db = new RealCustomerDatabase();
        AddCustomer addCustomer = new AddCustomer(db);

        addCustomer.add("name");

        assertTrue(db.contains(new Customer("name")));
    }

    @Test
    void faster_with_spy() {
        CustomerDatabase db = Mockito.mock(RealCustomerDatabase.class);
        AddCustomer addCustomer = new AddCustomer(db);

        addCustomer.add("name");

        Mockito.verify(db).add(new Customer("name"));
    }

    @Test
    void even_faster_with_fake() {
        CustomerDatabase db = new FakeCustomerDatabase();
        AddCustomer addCustomer = new AddCustomer(db);

        addCustomer.add("name");

        assertTrue(db.contains(new Customer("name")));
    }
}
