package hw07;


public class Hw07Done {
    public static void main(String[] args) {

        String [][] schedule1 = new String[][]{{DayOfWeek.Sunday.name(),DayOfWeek.Monday.name()},{"Walk","Cinema"}};
        String [][] schedule2 = new String[][]{{DayOfWeek.Tuesday.name(),DayOfWeek.Wednesday.name()},{"Hiking","Football"}};
        String [][] schedule3 = new String[][]{{DayOfWeek.Thursday.name(),DayOfWeek.Friday.name()},{"Rugby","Picnic"}};

        String [] habitsForFish = new String[] {"Swim","Flip","Eat"};

        Fish fish = new Fish("Nemo",1,70, habitsForFish);

        Man man = new Man("Jack","Parkinson",1980,70, schedule1);
        Woman woman = new Woman("Jane","Potter", 1970,75, schedule2);
        Man children = new Man("Nick","Parkinson",1999,90, schedule3);

        man.repairCar();
        System.out.println(man);

        woman.makeup();
        System.out.println(woman);

        Family family=new Family(man,woman,fish);
        family.addChild(children);
        System.out.println(family);

        family.getFather().describePet();
        family.getMother().describePet();
    }
}
