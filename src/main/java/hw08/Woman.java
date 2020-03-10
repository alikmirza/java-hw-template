package hw08;

import java.util.Map;

final class Woman extends Human {

    Woman(String name, String surname, int year, int iq, Map<String,String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    void makeup(){
        System.out.print("My makeup\n");
    }

}
