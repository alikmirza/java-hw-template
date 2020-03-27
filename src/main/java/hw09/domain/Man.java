package hw09.domain;


import hw09.domain.Human;

import java.util.Map;

public final class  Man extends Human {

    public Man(String name, String surname, int year, int iq, Map<String, String> schedule){
        super(name,surname,year,iq,schedule);
    }

    void repairCar(){
        System.out.print("Hello, I am going to repair my car\n");
    }

}
