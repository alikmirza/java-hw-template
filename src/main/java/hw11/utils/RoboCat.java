package hw11.utils;

import hw11.domain.Pet;

import java.util.HashSet;

public class RoboCat extends Pet {


    public RoboCat(String nickname, int age, int trickLevel, HashSet<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.species= Species.RoboCat;
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

}
