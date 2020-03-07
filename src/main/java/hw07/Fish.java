package hw07;

import java.util.Arrays;

public  class Fish extends Pet {

    Fish(String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
        this.species=Species.Fish;
    }



    @Override
    public String toString(){
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species,  getNickname(), getAge(), getTrickLevel(), Arrays.toString(getHabits()));
    }

    @Override
    public void respond() { System.out.printf("Hello owner. I am - %s\n",getNickname()); }


}
