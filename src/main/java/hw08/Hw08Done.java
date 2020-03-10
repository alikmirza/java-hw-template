package hw08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hw08Done {
    public static void main(String[] args) {

        HashSet<String> habitsForFish = new HashSet<>();
        habitsForFish.add("Swim");
        habitsForFish.add("Flip");
        habitsForFish.add("Eat");

        HashSet<String> habitsForDog = new HashSet<>();
        habitsForDog.add("Run");
        habitsForDog.add("Eat");
        habitsForDog.add("Sleep");

        HashSet<String> habitsForRoboCat = new HashSet<>();
        habitsForRoboCat.add("Fight");
        habitsForRoboCat.add("Charge");
        habitsForRoboCat.add("Light");


        Map<String,String> schedule1= new HashMap<>();
        schedule1.put(DayOfWeek.Sunday.name(),"Walk");
        schedule1.put(DayOfWeek.Monday.name(),"Cinema");

        Map<String,String> schedule2= new HashMap<>();
        schedule2.put(DayOfWeek.Tuesday.name(),"Hiking");
        schedule2.put(DayOfWeek.Wednesday.name(),"Football");

        Map<String,String> schedule3= new HashMap<>();
        schedule3.put(DayOfWeek.Thursday.name(),"Rugby");
        schedule3.put(DayOfWeek.Friday.name(),"Picnic");


        Fish fish = new Fish("Nemo",1,70, habitsForFish);
        Dog dog = new Dog("Bob",5,30, habitsForDog);
        RoboCat roboCat=new RoboCat("Cap",4,95, habitsForRoboCat);

        Set<Pet> pets=new HashSet<>();
        pets.add(fish);
        pets.add(dog);
        pets.add(roboCat);

        Man man = new Man("Jack","Parkinson",1980,70, schedule1);
        Woman woman = new Woman("Jane","Potter", 1970,75, schedule2);
        Man children = new Man("Nick","Parkinson",1999,90, schedule3);


        Family family=new Family(man,woman,pets);
        family.addChild(children);
        System.out.println(family);
    }
}
