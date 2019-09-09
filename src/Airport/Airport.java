package Airport;

import java.util.Objects;

public final class Airport implements InterfaceAirport{

    private String code;

    public Airport(String n) throws Exception {
        if(n.length()==3){code=n;}
        else throw new Exception(
                "airport 3 caractere uniquement"
        );

    }

    @Override
    public String getCode() {
        return code;
    }

}
