package ie.gmit.passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    private Passenger pass;

    @Test
    void TestValidTitle() {
        pass = new Passenger("Mr", "Conor");
        assertEquals("Mr", pass.getTitle());
    }
    @Test
    void TestInvalidTitle() {
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Miss","Conor"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void TestValidName() {
        pass = new Passenger("Mr", "Con");
        assertEquals("Con", pass.getName());
    }
    @Test
    void TestInvalidName() {
        final String invalid = "Invalid name provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms","Co"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

}
