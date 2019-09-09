package FlightSection;

import Seat.EnumSeatClass;
import Seat.InterfaceSeat;

import java.util.Set;

public class FlightSection implements InterfaceFlightSection {

    private EnumSeatClass section;
    private Set<InterfaceSeat> setSeat;

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
