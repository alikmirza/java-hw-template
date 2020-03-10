package hw07;

public final class Woman extends Human {

    Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void makeup(){
        System.out.print("My makeup\n");
    }

    @Override
    public void describePet(){
        System.out.printf("Hi girls, I have a %s he is %d years old, %s\n",
                family.getPet(), family.getPet().getAge(), family.getPet().trickLevel(family.getPet().getTrickLevel()));
    }


}
