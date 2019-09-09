package FlightSection;

import Seat.EnumSeatClass;
import Seat.InterfaceSeat;

import java.util.HashSet;
import java.util.Set;

public class FlightSection implements InterfaceFlightSection {

    private EnumSeatClass section;
    private final Set<InterfaceSeat> setSeat;

    public FlightSection() {
        setSeat= new HashSet<>();
    }

    @Override
    public EnumSeatClass getSeatClass() {
        return section;
    }

    @Override
    public Boolean hasAvailableSeats() {
        return setSeat.stream().filter(e -> e.getStatus() == false).count() > 0 ? true : false;
    }

    @Override
    public Boolean bookSeat() {
        return null;
    }
}
