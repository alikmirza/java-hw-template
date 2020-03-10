package hw07;

public abstract class Pet {
    protected Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    Pet( String nickname, int age, int trickLevel, String[] habits){
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }


    String getNickname() { return nickname; }

    int getAge() { return age; }

    int getTrickLevel() { return trickLevel; }

    String[] getHabits() { return habits; }


    public  void eat(){ System.out.println("I am eating"); }

    public abstract void respond();

    protected String trickLevel(int trickLevel) {
        if (trickLevel > 50) {
            return "He is very sly";
        } else
            return "He is almost not sly";
    }
}
