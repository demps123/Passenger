package ie.gmit.passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    private Passenger pass;

    @Test
    void TestValidTitle() {
        pass = new Passenger("Mr", "Conor", "1234567890");
        assertEquals("Mr", pass.getTitle());
    }
    @Test
    void TestInvalidTitle() {
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Miss","Conor", "1234567890"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void TestValidName() {
        pass = new Passenger("Mr", "Con", "1234567890");
        assertEquals("Con", pass.getName());
    }
    @Test
    void TestInvalidName() {
        final String invalid = "Invalid name provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms","Co", "1234567890"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void TestValidID() {
        pass = new Passenger("Mrs", "Conor", "1234567890");
        assertEquals("1234567890", pass.getID());
    }
    @Test
    void TestInvalidID() {
        final String invalid = "Invalid ID provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs","Conor", "123456890"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
