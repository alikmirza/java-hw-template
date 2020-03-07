package hw08;

import java.util.Arrays;
import java.util.Map;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String,String> schedule;
    private Pet pet;
    private Family family;




    Human(String name, String surname, int year, int iq,Map<String,String> schedule, Pet pet){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.schedule=schedule;


    }


    String getName() { return name; }

    String getSurname() { return surname; }

    int getYear() { return year; }

    public int getIq() { return iq; }

    public Map<String, String> getSchedule() { return schedule; }

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setYear(int year) { this.year = year; }

    public void setIq(int iq) { this.iq = iq; }


    public void setSchedule(Map<String, String> schedule) { this.schedule = schedule; }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    void setFamily(Family family) {
        this.family = family;
    }


    public void describePet() {
        System.out.printf("I have a %s he is %d years old, %s\n",
               getPet().species, pet.getAge(), pet.trickLevel(pet.getTrickLevel()));
    }



    @Override
    public String toString(){
        return String.format("Human{name='%s', surname='%s', year='%d', iq=%d', Schedule=%s, %s",
                name, surname, year, iq, schedule,pet);
    }

}
