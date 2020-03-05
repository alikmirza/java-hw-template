package hw06;

public class Hw06Done {
    public static void main(String[] args) {

        Pet petOfFirstChild=new Pet(Species.Dog.name(),"Rock",5,75,
                new String[]{"eat","drink","sleep"});
        Pet petOfSecondChild=new Pet(Species.Cat.name(),"Garfield",3,80,
                new String[]{"run","fight","sleep"});

        String[][] scheduleForFirst=new String[][]{{DayOfWeek.Sunday.name(),DayOfWeek.Monday.name()},{"walk","cinema"}};
        String[][] scheduleForSecond=new String[][]{{DayOfWeek.Friday.name(),DayOfWeek.Tuesday.name()},{"do home work","hiking"}};


        Human father=new Human("Vito","karleone",1965);
        Human mother=new Human("Jane","Karleone",1970);

        Human firstChild=new Human("Michael","Karleone",1980,90,scheduleForFirst, petOfFirstChild);
        Human secondChild=new Human("Nicky","Karleone",1985,80,scheduleForSecond,petOfSecondChild);

        Family family=new Family(father,mother);
        System.out.println(family.countFamily());
        System.out.println(family);

        family.addChild(firstChild);
        System.out.println(family.countFamily());
        System.out.println(family);

        family.addChild(secondChild);
        System.out.println(family.countFamily());
        System.out.println(family);

        family.deleteChild(firstChild);
        System.out.println(family.countFamily());
        System.out.println(family);

//        for (int i = 10_000; i <1_000_000 ; i++) {
//            Human father=new Human("Vito","karleone",1965);
//            Human mother=new Human("Jane","Karleone",1970);
//            Family family=new Family(father,mother);
//            Human firstChild=new Human("Michael","Karleone",1980,90,scheduleForFirst, petOfFirstChild);
//            Human secondChild=new Human("Nicky","Karleone",1985,80,scheduleForSecond,petOfSecondChild);
//            family.addChild(firstChild);
//            family.addChild(secondChild);
//            family.finalize();
//            father.finalize();
//            mother.finalize();
//            firstChild.finalize();
//            secondChild.finalize();
//            petOfFirstChild.finalize();
//            petOfSecondChild.finalize();
//        }


    }
}
