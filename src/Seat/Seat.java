package Seat;

import java.util.Objects;

public class Seat implements InterfaceSeat{

    InterfaceSeatID seatNum;
    Boolean isBooked;

    public Seat(InterfaceSeatID seatNum, Boolean isBooked) {
        this.seatNum = seatNum;
        this.isBooked = isBooked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(seatNum, seat.seatNum) &&
                Objects.equals(isBooked, seat.isBooked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatNum, isBooked);
    }

    @Override
    public InterfaceSeatID getSeatNum() {
        return seatNum;
    }

    @Override
    public Boolean getStatus() {
        return isBooked;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Numero de siege").append(seatNum).append("-").append("est pris").append(isBooked).toString();
    }

}
