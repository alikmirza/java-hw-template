package hw09.domain;


import hw09.domain.Human;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, Map<String, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    void makeup(){
        System.out.print("My makeup\n");
    }

}
