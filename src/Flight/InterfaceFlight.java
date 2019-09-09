package Flight;

import Airline.InterfaceAirline;
import Airport.InterfaceAirport;
import FlightSection.InterfaceFlightSection;

import java.util.Calendar;

public interface InterfaceFlight {


    InterfaceAirline getAirline();
    String getID();
    InterfaceAirport getOrig();
    InterfaceAirport getDest();
    Calendar getDate();
    Boolean hasSection();
    Boolean hasSeats();
    Boolean createSection();
    InterfaceFlightSection findSection();
    void bookSeat();

}
