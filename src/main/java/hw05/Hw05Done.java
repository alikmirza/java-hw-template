package hw05;

public class Hw05Done {
    public static void main(String[] args) {

        Pet petofFirstChild=new Pet("Dog","Rock",5,35,new String[]{"eat","drink","sleep"});
        Pet petofSecondChild=new Pet("Cat","Garfield",3,80,new String[]{"run","fight","sleep"});
        String[][] scheduleForFirst=new String[][]{{"Saturday","Sunday"},{"walk","cinema"}};
        String[][] scheduleForSecond=new String[][]{{"Saturday","Sunday"},{"do home work","hiking"}};

        Human father=new Human("Vito","karleone",1965);
        Human mother=new Human("Jane","Karleone",1970);
        Human firstChild=new Human("Michael","Karleone",1980,90,scheduleForFirst,petofFirstChild);
        Human secondChild=new Human("Nicky","Karleone",1985,80,scheduleForSecond,petofSecondChild);

        Family family=new Family(father,mother);

        System.out.println(family.countFamily());
        System.out.println(family);
        family.addChild(firstChild);
        System.out.println(family.countFamily());
        System.out.println(family);
        family.addChild(secondChild);
        System.out.println(family.countFamily());
        System.out.println(family);
        family.deleteChild(secondChild);
        System.out.println(family.countFamily());
        System.out.println(family);
        firstChild.describePet();
        secondChild.describePet();





    }
}
