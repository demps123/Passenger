package ie.gmit.passenger;

import ie.gmit.passenger.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    Passenger pass = new Passenger("Mr");

    @Test
    void TestValidTitle() {
        assertEquals("Mr", pass.getTitle());
    }

}
