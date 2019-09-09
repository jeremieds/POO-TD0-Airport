package Flight;

import Airline.InterfaceAirline;
import FlightSection.InterfaceFlightSection;

import java.util.Calendar;

public class Flight implements InterfaceFlight {

    @Override
    public InterfaceAirline getAirline() {
        return null;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public void getOrig() {

    }

    @Override
    public void getDest() {

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
