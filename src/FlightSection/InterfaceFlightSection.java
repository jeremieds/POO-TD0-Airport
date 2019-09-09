package FlightSection;

import Seat.EnumSeatClass;
import Seat.InterfaceSeat;

public interface InterfaceFlightSection {

    EnumSeatClass getSeatClass();
    Boolean hasAvailableSeats();
    Boolean bookSeat();
}
