package hw06;

public class Hw06Done {
    public static void main(String[] args) {

        Pet petOfFirstChild=new Pet(Species.Dog.name(),"Rock",5,75,
                new String[]{"eat","drink","sleep"});
        Pet petOfSecondChild=new Pet(Species.Cat.name(),"Garfield",3,80,
                new String[]{"run","fight","sleep"});


        Human human1=new Human("Vito","karleone",1965);
        Human human2=new Human("Jane","Karleone",1970);

        Human human3=new Human("Michael","Karleone",1980,90,
                new String[][]{{DayOfWeek.Sunday.name(),DayOfWeek.Monday.name()},{"walk","cinema"}}, petOfFirstChild);

        Human human4=new Human("Nicky","Karleone",1985,80,
                new String[][]{{DayOfWeek.Friday.name(),DayOfWeek.Tuesday.name()},{"do home work","hiking"}},petOfSecondChild);

        Family family=new Family(human1,human2);
        System.out.println(family);
        family.countFamily();

        family.addChild(human3);
        System.out.println(family);
        family.countFamily();

        family.addChild(human4);
        System.out.println(family);
        family.countFamily();

        family.deleteChild(human3);
        System.out.println(family);
        family.countFamily();


//        for (int i = 10_000; i <1_000_000 ; i++) {
//            Human human1=new Human("Vito","karleone",1965);
//            Human human2=new Human("Jane","Karleone",1970);
//            Family family=new Family(human1,human2);
//        }

        System.gc();
        Family family1=new Family();
        family1=null;
        System.gc();

        Pet pet1=new Pet();
        pet1=null;
        System.gc();

        Human humanFianlize=new Human();
        humanFianlize=null;
        System.gc();






    }
}
