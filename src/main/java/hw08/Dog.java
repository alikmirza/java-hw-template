package hw08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dog extends Pet implements SpecialMethod {


    Dog(String nickname, int age, int trickLevel, HashSet<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.species= Species.Dog;
    }


    @Override
    public String toString(){
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species, getNickname(), getAge(), getTrickLevel(), getHabits());
    }

    @Override
    public void respond() {
        System.out.printf("Hello owner. I am - %s\n",getNickname());
    }


    @Override
    public void foul() {
        System.out.print("I need to cover it up\n");
    }
}
