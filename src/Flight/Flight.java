package Flight;

import Airline.InterfaceAirline;
import Airport.InterfaceAirport;
import FlightSection.InterfaceFlightSection;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Flight implements InterfaceFlight {


    private Calendar flightDate;
    private String flightID;
    private InterfaceAirport orig;
    private InterfaceAirport dest;
    private String id;
    private InterfaceAirline airline;

    public Flight(InterfaceAirline airline,InterfaceAirport orig, InterfaceAirport dest, Calendar date, String id) {
        this.flightID=id;
        this.flightDate=date;
        this.orig=orig;
        this.dest=dest;
        this.airline=airline;
    }

    @Override
    public InterfaceAirline getAirline() {
        return null;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public InterfaceAirport getOrig() {
        return null;
    }

    @Override
    public InterfaceAirport getDest() {
        return null;
    }


    @Override
    public Calendar getDate() {
        return null;
    }

    @Override
    public Boolean hasSection() {
        return null;
    }

    @Override
    public Boolean hasSeats() {
        return null;
    }

    @Override
    public Boolean createSection() {
        return null;
    }

    @Override
    public InterfaceFlightSection findSection() {
        return null;
    }


    @Override
    public void bookSeat() {

    }
}
