package hw05;

public class Hw05Done {
    public static void main(String[] args) {

        Pet petofFirstChild=new Pet("Dog","Rock",5,75,new String[]{"eat","drink","sleep"});
        Pet petofSecondChild=new Pet("Cat","Garfield",3,80,new String[]{"run","fight","sleep"});


        Human human1=new Human("Vito","karleone",1965);
        Human human2=new Human("Jane","Karleone",1970);
        Human human3=new Human("Michael","Karleone",1980,90,new String[][]{{"Saturday","Sunday"},{"walk","cinema"}},petofFirstChild);
        Human human4=new Human("Nicky","Karleone",1985,80,new String[][]{{"Saturday","Sunday"},{"do home work","hiking"}},petofSecondChild);
        Family family=new Family(human1,human2);
       ///yhh System.out.println(family.countFamily());
        family.countFamily();
        family.addChild(human3);
        family.countFamily();
        family.addChild(human4);
        family.countFamily();
        System.out.println(family);
        System.out.println(family.deleteChild(human4));
       family.countFamily();
        System.out.println(family);






    }
}
