package Airline;

import Airport.Airport;
import Airport.InterfaceAirport;
import Flight.Flight;
import Flight.InterfaceFlight;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public final class Airline implements InterfaceAirline {

    private String Nom;
    private final Set<InterfaceFlight> setFlight;

    public Airline() {
        this.setFlight = new HashSet<>();
    }

    public Airline(String n) throws Exception {
        this();
        if (n.length() == 5) {
            Nom = n;
        } else throw new Exception(
                "Airline 5 caractere uniquement"
        );

    }


    @Override
    public String getNom() {
        return null;
    }

    @Override
    public InterfaceFlight createFlight(InterfaceAirport orig, InterfaceAirport dest, Calendar date, String id) {
        setFlight.add(new Flight(this, orig, dest, date, id));
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
