package FlightSection;

import Seat.InterfaceSeat;

public interface InterfaceFlightSection {

    InterfaceSeat getSeatClass();
    Boolean hasAvailableSeats();
    Boolean bookSeat();
}
