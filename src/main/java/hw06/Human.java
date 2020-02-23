package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Pet pet;
    private Family family;


    static {
        System.out.println("Human class is downloading...");
    }

    {
        System.out.println("The Object of type of Human is creating...");
    }




    String getName() { return name; }

    String getSurname() { return surname; }

    int getYear() { return year; }

    public int getIq() { return iq; }

    public String[][] getSchedule() { return schedule; }

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setYear(int year) { this.year = year; }

    public void setIq(int iq) { this.iq = iq; }


    public void setSchedule(String[][] schedule) { this.schedule = schedule; }

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

    Human() { }


    Human(String name, String surname, int year){
        this.name=name;
        this.surname=surname;
        this.year=year;

    }


    Human(String name, String surname, int year, int iq,String [][] schedule, Pet pet){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.schedule=schedule;


    }


    @Override
    public String toString(){
        return String.format("Human{name='%s', surname='%s', year='%d', iq=%d', Schedule=%s, %s",
                name, surname, year, iq,Arrays.deepToString(schedule),pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    protected void finalize(){
        System.out.println("this");
    }


    public void describePet() {
        System.out.printf("I have a %s he is %d years old, he is very sly %d\n", pet.getSpecies(), pet.getAge(), pet.getTrickLevel());
    }

}