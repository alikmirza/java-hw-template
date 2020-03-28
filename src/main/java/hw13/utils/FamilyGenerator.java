package hw13.utils;

import hw13.controller.FamilyController;
import hw13.domain.Family;
import hw13.domain.Man;
import hw13.domain.Pet;
import hw13.domain.Woman;

import java.util.*;

public class FamilyGenerator {

    private FamilyController familyController=new FamilyController();

    public List<Family> generate(){
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

        Man firstMan = new Man("Jack","Parkinson","10/11/1970",70, schedule1);
        Woman firstWoman = new Woman("Jane","Potter", "21/02/1980",75, schedule2);
        Man secondMan=new Man("John","Claus","20/01/1975",70,schedule2);
        Woman secondWoman=new Woman("Emmy","Winehouse","20/03/1984",89,schedule2);
        Man firstChildren = new Man("Nick","Parkinson","15/01/1995",90, schedule3);
        Woman secondChildren = new Woman("Lilly","Parkinson","17/07/1997",77, schedule3);



        Family firsFamily=new Family(firstMan,firstWoman,pets);
        Family secondFamily=new Family(secondMan,secondWoman,pets);
        firsFamily.addChild(firstChildren);
        firsFamily.addChild(secondChildren);


        familyController.saveFamily(firsFamily);
        familyController.saveFamily(secondFamily);
        return new ArrayList<>(Arrays.asList(firsFamily,secondFamily));
    }

    private Man anotherMan=new Man();
    private Woman anotherWoman=new Woman();

    public Man getAnotherMan() {
        return anotherMan;
    }

    public Woman getAnotherWoman() {
        return anotherWoman;
    }

    public void createMan(String name, String surname, long birthDate, int iq){
        anotherMan.setName(name);
        anotherMan.setSurname(surname);
        anotherMan.setBirthDate(birthDate);
        anotherMan.setIq(iq);
    }

    public void createWoman(String name, String surname, long birthDate, int iq){
        anotherWoman.setName(name);
        anotherWoman.setSurname(surname);
        anotherWoman.setBirthDate(birthDate);
        anotherWoman.setIq(iq);
    }

    public void createFamily(){
        familyController.createNewFamily(anotherMan,anotherWoman);
    }
}
