package hw04;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    Human() { }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = new Human();
        this.mother = new Human();
    }

    Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    Human(String name, String surname, int year, int iq, Human mother, Human father,
          String[][] schedule, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year='%d', iq=%d', father=%s %s, mother=%s %s, schedule=%s " +
                        " ,%s", name, surname, year, iq, father.name, father.surname, mother.name, mother.surname,Arrays.deepToString(schedule), pet);
    }


    void greetPet() {
        System.out.println("Hello," + pet.nickname);
    }

    void describePet() {
        System.out.printf("I have a %s he is %d years old, %s\n", pet.species, pet.age, pet.trickLevel(pet.trickLevel));
    }

}