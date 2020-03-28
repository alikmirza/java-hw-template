package hw13.domain;

import hw13.utils.Species;

import java.io.Serializable;
import java.util.HashSet;

public class Pet implements Serializable {
    protected Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;

    public Pet() {
    }

    public Pet(String nickname, int age, int trickLevel, HashSet<String> habits){
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }


    public String getNickname() { return nickname; }

    public int getAge() { return age; }

    public int getTrickLevel() { return trickLevel; }

    public HashSet<String> getHabits() { return habits; }


    public  void eat(){ System.out.println("I am eating"); }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }



    protected String trickLevel(int trickLevel) {
        if (trickLevel > 50) {
            return "He is very sly";
        } else
            return "He is almost not sly";
    }

    @Override
    public String toString(){
        return String.format("\t\n\t\t{'%s', nickname='%s', age='%d', trickLevel=%d', habits=%s}\n",
                species, nickname, age, trickLevel, habits);
    }
}
