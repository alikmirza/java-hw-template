package hw13;

import hw13.utils.Console;
import hw13.utils.FamilyGenerator;

public class Hw13Done {
    public static void main(String[] args) {
        Console console=new Console();
        FamilyGenerator familyGenerator=new FamilyGenerator();
        familyGenerator.generate();
        while (true){
            console.run();
        }
    }
}
