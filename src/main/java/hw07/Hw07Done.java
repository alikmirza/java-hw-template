package hw07;

public class Hw07Done {
    public static void main(String[] args) {
        String [][] schedule1 = new String[][]{{DayOfWeek.Sunday.name(),DayOfWeek.Monday.name()},{"Walk","Cinema"}};
        String [][] schedule2 = new String[][]{{DayOfWeek.Tuesday.name(),DayOfWeek.Wednesday.name()},{"Hiking","Football"}};
        String [][] schedule3 = new String[][]{{DayOfWeek.Thursday.name(),DayOfWeek.Friday.name()},{"Rugby","Picnic"}};

        String [] habitsForFish = new String[] {"Swim","Flip","Eat"};
        String [] habitsForDog = new String[] {"Run","Eat","Sleep"};
        String [] habitsForRoboCat =new String[] {"Fight","Charge","Light"};

        Fish fish = new Fish("Nemo",1,70, habitsForFish);
        Dog dog = new Dog("Bob",5,30, habitsForDog);
        RoboCat roboCat=new RoboCat("Cap",4,95, habitsForRoboCat);

        Man man = new Man("Jack","Parkinson",1980,70, schedule1,fish);
        Woman woman = new Woman("Jane","Potter", 1970,75, schedule2, dog);
        Man children = new Man("Nick","Parkinson",1999,90, schedule3, roboCat);

        man.describePet();
        man.repairCar();
        fish.respond();
        System.out.println(man);

        woman.describePet();
        woman.makeup();
        dog.respond();
        dog.foul();
        System.out.println(woman);

        Family family=new Family(man,woman);
        family.addChild(children);
        System.out.println(family);
    }
}
