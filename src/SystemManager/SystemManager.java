package SystemManager;

import Airline.Airline;
import Airline.InterfaceAirline;
import Airport.Airport;
import Airport.InterfaceAirport;
import Flight.Flight;
import Seat.EnumSeatClass;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public final class SystemManager implements InterfaceSystemManager {
    //private Set<InterfaceAirline> setAirline;
    private Set<InterfaceAirport> setAirport;
    private Set<InterfaceAirline> setAirline;

    public SystemManager() {
        this.setAirport = new HashSet<>();
        this.setAirline = new HashSet<>();
    }


    @Override
    public void createAirport(String n) throws Exception {
       setAirport.add(new Airport(n));
    }

    @Override
    public void createAirline(String n) throws Exception{
        setAirline.add(new Airline(n));
    }

    @Override
    public void createFlight(String n, InterfaceAirport orig, InterfaceAirport dest, Calendar date, String id) {

        for (InterfaceAirline i : setAirline) {
            if (i.getNom() == n) {
                i.createFlight(orig, dest, date, id);
            }
        }
    }

    @Override
    public void createSection(String air, String flID, int rows, int cols, EnumSeatClass s) {



    }

    @Override
    public void findAvailableFlights(String orig, String dest) {

    }

    @Override
    public void bookSeat(String air, String fl, EnumSeatClass s, int row, char col) {

    }

    @Override
    public void displaySystemDetails() {

    }
}
