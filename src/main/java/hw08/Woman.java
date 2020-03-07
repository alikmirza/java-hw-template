package hw08;

import java.util.Map;

public final class Woman extends Human {

    Woman(String name, String surname, int year, int iq, Map<String,String> schedule, Pet pet) {
        super(name, surname, year, iq, schedule, pet);
    }

    void makeup(){
        System.out.print("My makeup\n");
    }

    @Override
    public void describePet(){
        System.out.printf("Hi girls, I have a %s he is %d years old, %s\n",
                getPet(), getPet().getAge(), getPet().trickLevel(getPet().getTrickLevel()));
    }


}
