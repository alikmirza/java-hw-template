package hw04;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    @Override
    public String toString(){
        return String.format("Dog{nickname='%s', age=%d, trickLevel=%d, habits=%s}", nickname, age, trickLevel, Arrays.toString(habits));
    }

    public Pet(String species, String nickname){
        this.species =species;
        this.nickname=nickname;

    }

    public Pet(String species, String nickname, int age, int trickLevel, String [] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }


    public Pet(){ }

    public  void eat(){
        System.out.print("I am eating \n");
    }
    public void respond(){
        System.out.printf("Hello owner. I am - %s\n",nickname);
    }
    public void foul(){
        System.out.print("I need to cover it up\n");
    }

   /* public void Trick(){
        if(trickLevel>50){
            System.out.printf("he is very sly: %d",trickLevel);}
        else System.out.printf("he is almost not sly: %d",trickLevel);

    }*/

}
