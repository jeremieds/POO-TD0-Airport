package Airline;

import Flight.InterfaceFlight;

public interface InterfaceAirline {

    InterfaceFlight createFlight();
    InterfaceFlight findFlight();
    void createSection();
    void getAvailableFlights();
    void bookFlight();

}
