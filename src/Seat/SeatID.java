package Seat;

public class SeatID implements InterfaceSeatID {

    private int row;
    private char column;

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public char getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(row).append("-").append(column).toString();
    }
}
