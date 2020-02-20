package hw04;

public class HW04Done {
    public static void main(String[] args) {

        Pet pet=new Pet("Dog","Rock",5,75,new String[]{"eat","drink","sleep"});
        Human human1=new Human("Michael","Karleone",1977,90,new Human(),new Human(),pet);
        human1.father.name="Vito";
        human1.father.surname="Karleone";
        human1.mother.name="Jane";
        human1.mother.surname="Karleone";
        System.out.println(human1);
        human1.schedule= new String[][]{{"Saturday", "Sunday"}, {"go to cinema", "hiking"}};
        System.out.printf("Non-working activity for %s is %s\n",human1.schedule[0][0],human1.schedule[1][0]);
        System.out.printf("Non-working activity for %s is %s\n",human1.schedule[0][1],human1.schedule[1][1]);
        human1.greetPet();
        human1.describePet();
        Human human2=new Human("Peter","Parker",1990);
        System.out.println(human2);
        Human human3=new Human("Harry","Potter",1980,new Human(),new Human());
        human3.father.name="James";
        human3.father.surname="Potter";
        human3.mother.name="Lilly";
        human3.mother.surname="Potter";
        System.out.println(human3);

        System.out.println(pet);
        pet.eat();
        pet.respond();
        pet.foul();




    }
}
