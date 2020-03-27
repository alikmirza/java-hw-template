package hw12.domain;

import hw12.utils.Species;

import java.util.HashSet;

public abstract class Pet {
    protected Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;

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

    public abstract void respond();

    protected String trickLevel(int trickLevel) {
        if (trickLevel > 50) {
            return "He is very sly";
        } else
            return "He is almost not sly";
    }
}
