package Flight;

import Airline.InterfaceAirline;
import FlightSection.InterfaceFlightSection;

import java.util.Calendar;

public interface InterfaceFlight {


    InterfaceAirline getAirline();
    String getID();
    void getOrig();
    void getDest();
    Calendar getDate();
    Boolean hasSection();
    Boolean hasSeats();
    Boolean createSection();
    InterfaceFlightSection findSection();
    void bookSeat();

}
