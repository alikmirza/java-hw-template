package hw07;

import java.util.Arrays;

public final class  Man extends Human {

    Man(String name, String surname, int year, int iq,String [][] schedule, Pet pet){
        super(name,surname,year,iq,schedule,pet);
    }


    void repairCar(){
        System.out.print("Hello, I am going to repair my car\n");
    }

    @Override
    public void describePet(){
        System.out.printf("Hi boys, I have a %s he is %d years old, %s\n",
                getPet(), getPet().getAge(), getPet().trickLevel(getPet().getTrickLevel()));
    }

}
