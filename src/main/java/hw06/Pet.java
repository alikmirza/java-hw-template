package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    static {
        System.out.println("Pet class is downloading...");
    }

    {
        System.out.println("The Object of Pet is creating...");
    }



    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    Pet(){ }

    public Pet(String species, String nickname){
        this.species =species;
        this.nickname=nickname;

    }

    Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }


    String getSpecies() { return species; }

    public String getNickname() { return nickname; }

    int getAge() { return age; }

    int getTrickLevel() { return trickLevel; }

    public String[] getHabits() { return habits; }

    public void setSpecies(String species) { this.species = species; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public void setAge(int age) { this.age = age; }

    public void setTrickLevel(int trickLevel) { this.trickLevel = trickLevel; }

    public void setHabits(String[] habits) { this.habits = habits; }



    public void eat(){
        System.out.print("I am eating \n");
    }
    public void respond(){
        System.out.printf("Hello owner. I am - %s\n",nickname);
    }
    public void foul(){
        System.out.print("I need to cover it up\n");
    }


    String trickLevel(int trickLevel) {
        if (trickLevel > 50) {
            return "He is very sly";
        } else
            return "He is almost not sly";
    }

    @Override
    public String toString(){
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",species, nickname, age, trickLevel, Arrays.toString(habits));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize method of Pet Class");
    }

}