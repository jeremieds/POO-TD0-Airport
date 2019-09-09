package SystemManager;

import Airline.InterfaceAirline;
import Airport.InterfaceAirport;
import Seat.EnumSeatClass;

import java.util.Calendar;

public interface InterfaceSystemManager {

    void createAirport(String n) throws Exception;
    void createAirline(String n) throws Exception;
    void createFlight(String n, InterfaceAirport orig, InterfaceAirport dest, Calendar date, String id);
    void createSection(String air, String flID, int rows, int cols, EnumSeatClass s);
    void findAvailableFlights(String orig, String dest);
    void bookSeat(String air, String fl, EnumSeatClass s, int row, char col);
    void displaySystemDetails();
}
