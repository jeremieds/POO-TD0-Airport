package FlightSection;

import Seat.InterfaceSeat;

public interface InterfaceFlightSection {

    InterfaceSeat getSeatClass();
    boolean hasAvailableSeats();
    boolean bookSeat();
}
