package hw08;

import java.util.Map;

final class  Man extends Human {

    Man(String name, String surname, int year, int iq, Map<String,String> schedule){
        super(name,surname,year,iq,schedule);
    }

    void repairCar(){
        System.out.print("Hello, I am going to repair my car\n");
    }

}
