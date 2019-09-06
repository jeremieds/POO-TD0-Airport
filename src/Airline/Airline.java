package Airline;

import Flight.InterfaceFlight;

public class Airline implements InterfaceAirline{

    private String Nom;

    public String getNom(){
        return Nom;
    }

    @Override
    public InterfaceFlight createFlight() {
        return null;
    }

    @Override
    public InterfaceFlight findFlight() {
        return null;
    }

    @Override
    public void createSection() {

    }

    @Override
    public void getAvailableFlights() {

    }

    @Override
    public void bookFlight() {

    }
}
