package hw12.domain;


import java.time.LocalDate;
import java.util.Map;

public final class  Man extends Human {

    public Man(String name, String surname, String birthDate, int iq, Map<String, String> schedule){
        super(name,surname,birthDate,iq,schedule);
    }

    public Man(Map<String, String> schedule1) {
    }

    public Man() {

    }

    void repairCar(){
        System.out.print("Hello, I am going to repair my car\n");
    }

}
