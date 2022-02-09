package ie.gmit.passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
    private Passenger pass;

    @Test
    void TestValidTitle() {
        pass = new Passenger("Mr");
        assertEquals("Mr", pass.getTitle());
    }

    @Test
    void TestInvalidTitle() {
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Miss"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

}
