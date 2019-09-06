package Flight;

import Airline.InterfaceAirline;

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
    InterfaceFlight findSection();
    void bookSeat();

}
