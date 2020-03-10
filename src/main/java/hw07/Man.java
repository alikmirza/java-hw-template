package hw07;

public final class  Man extends Human {

    Man(String name, String surname, int year, int iq,String [][] schedule){
        super(name,surname,year,iq,schedule);
    }


    void repairCar(){
        System.out.print("Hello, I am going to repair my car\n");
    }

    @Override
    public void describePet(){
        System.out.printf("Hi boys, I have a %s he is %d years old, %s\n",
                family.getPet(), family.getPet().getAge(), family.getPet().trickLevel(family.getPet().getTrickLevel()));
    }

}
