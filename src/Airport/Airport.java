package Airport;

import java.util.Objects;

public final class Airport implements InterfaceAirport{

    private String code;

    @Override
    public String getName() {
        return code;
    }

}