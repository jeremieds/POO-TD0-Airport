package Airline;

import Airport.InterfaceAirport;
import Flight.InterfaceFlight;

import java.util.Calendar;

public interface InterfaceAirline {

    String getNom();
    InterfaceFlight createFlight(InterfaceAirport orig, InterfaceAirport dest, Calendar date, String id);
    InterfaceFlight findFlight();
    void createSection();
    void getAvailableFlights();
    void bookFlight();

}
