package hw09;

import hw09.controller.FamilyController;
import hw09.domain.*;
import hw09.utils.DayOfWeek;
import hw09.utils.Dog;
import hw09.utils.Fish;
import hw09.utils.RoboCat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hw09Done {
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

        Dog anotherDog=new Dog("Hatiko",10,90, habitsForDog);

        Man firstMan = new Man("Jack","Parkinson",1980,70, schedule1);
        Woman firstWoman = new Woman("Jane","Potter", 1970,75, schedule2);
        Man secondMan=new Man("John","Claus",1990,70,schedule2);
        Woman secondWoman=new Woman("Emmy","Winehouse",1992,89,schedule2);
        Man firstChildren = new Man("Nick","Parkinson",1999,90, schedule3);
        Woman secondChildren = new Woman("Lilly","Parkinson",1956,77, schedule3);

        Man anotherMan=new Man("Jason","Statham",1970,87,schedule1);
        Woman anotherWoman=new Woman("Melissa","White",1975,87,schedule1);

        Human human=new Human("Alex","Claus",1995,90,schedule3);

        Family firsFamily=new Family(firstMan,firstWoman,pets);
        Family secondFamily=new Family(secondMan,secondWoman,pets);
        firsFamily.addChild(firstChildren);
        firsFamily.addChild(secondChildren);

        FamilyController familyController=new FamilyController();

        familyController.saveFamily(firsFamily);
        familyController.saveFamily(secondFamily);
        System.out.println(familyController.getAllFamilies());
        System.out.println();

        System.out.println(familyController.getFamiliesBiggerThan(3));
        System.out.println();

        System.out.println(familyController.getFamiliesLessThan(5));

        System.out.println();
        System.out.println(familyController.countFamiliesWithMemberNumber(4));

        familyController.createNewFamily(anotherMan,anotherWoman);
        System.out.println(familyController.getAllFamilies());
        System.out.println();

        familyController.bornChild(secondFamily,"Colin","July");
        System.out.println(familyController.getFamilyByIndex(1));
        System.out.println();

        familyController.adoptChild(secondFamily,human);
        System.out.println(familyController.getFamilyByIndex(1));
        System.out.println();

        System.out.println(familyController.count());
        System.out.println();

        System.out.println(familyController.getPets(1));
        System.out.println();

        familyController.addPet(1,anotherDog);
        System.out.println(familyController.getFamilyByIndex(1));

        System.out.println(familyController.displayAllFamilies());
        familyController.deleteAllChildrenOlderThen(20);
        System.out.println(familyController.getAllFamilies());
        System.out.println(familyController.displayAllFamilies());
    }
}
