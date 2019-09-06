package Airport;

public class Airport implements InterfaceAirport{

    private String code;

    @Override
    public String getName() {
        return code;
    }
}
