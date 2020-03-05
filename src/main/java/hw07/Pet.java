package hw07;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {

    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;



    String getNickname() { return nickname; }

    int getAge() { return age; }

    int getTrickLevel() { return trickLevel; }

    String[] getHabits() { return habits; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public void setAge(int age) { this.age = age; }

    public void setTrickLevel(int trickLevel) { this.trickLevel = trickLevel; }

    public void setHabits(String[] habits) { this.habits = habits; }




    Pet( String nickname, int age, int trickLevel, String[] habits){
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }


    public  void eat(){ System.out.println("I am eating"); }

    public abstract void respond();

    public abstract String trickLevel(int trickLevel);
}
