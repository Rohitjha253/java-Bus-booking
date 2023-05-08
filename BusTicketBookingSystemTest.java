import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.util.Arrays;
import java.util.List;
public class BusTicketBookingSystemTest {
    private BusTicketBookingSystem system;
    
    
    /* @Test
    void testBooking(){
        assertEquals(6, BusBookingSystem.bookTicket("Kolkata","Delhi"));
    } */

    @Test(expected = InvalidBookingException.class)
    public void testInvalidSource() throws InvalidBookingException {
        BusBookingSystem busBookingSystem = new BusBookingSystem();
        busBookingSystem.bookTicket("Delhi", "Mumbai");
        // Enter an invalid source.
        System.setIn(new java.io.ByteArrayInputStream("123\n".getBytes()));
        busBookingSystem.bookTicket("", "Mumbai");
    }
}