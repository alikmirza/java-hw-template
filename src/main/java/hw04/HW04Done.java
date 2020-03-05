package hw04;

public class HW04Done {
    public static void main(String[] args) {

        Pet pet=new Pet("Dog","Rock",5,30,new String[]{"eat","drink","sleep"});
        String[][] schedule =new String[][]{{"Saturday", "Sunday"}, {"go to cinema", "hiking"}};
        Human father=new Human("Vito","Karleone",1970);
        Human mother=new Human("Jane","Karleone",1980);
        Human child=new Human("Michael","Karleone",1977,90,mother,father,schedule,pet);
        System.out.println(child);
        child.greetPet();
        child.describePet();

        pet.eat();
        pet.respond();
        pet.foul();




    }
}
