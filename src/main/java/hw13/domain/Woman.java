package hw13.domain;


import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, String birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Woman(Map<String, String> schedule1) {
    }

    public Woman() {

    }

    void makeup(){
        System.out.print("My makeup\n");
    }

}

