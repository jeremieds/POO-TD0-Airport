package Seat;

public class Seat implements InterfaceSeat{

    InterfaceSeatID SeatNum;
    Boolean isBooked;

    @Override
    public InterfaceSeatID getSeatNum() {
        return SeatNum;
    }

    @Override
    public Boolean getStatus() {
        return isBooked;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Numero de siege").append(SeatNum).append("-").append("est pris").append(isBooked).toString();
    }

}
