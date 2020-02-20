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

    public Human() { }

    public Human(String name, String surname, int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=new Human();
        this.mother=new Human();
    }

    public Human(String name, String surname, int year, Human father,Human mother){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }

    public Human(String name,String surname,int year, int iq, Human mother, Human father,Pet pet ){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;

    }


    @Override
    public String toString(){
        return String.format("Human{name='%s', surname='%s', year='%d', iq=%d', father=%s %s, mother=%s %s, %s", name, surname, year, iq, father.name, father.surname, mother.name, mother.surname, pet);
    }



    public void greetPet(){
        System.out.println("Hello,"+pet.nickname);
    }
    public void describePet(){
        System.out.printf("I have a %s he is %d years old, he is very sly %d\n",pet.species ,pet.age,pet.trickLevel);
    }

}