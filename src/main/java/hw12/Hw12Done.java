package hw12;

import hw12.controller.FamilyController;
import hw12.domain.*;
import hw12.utils.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hw12Done {
    public static void main(String[] args) {
        Console console=new Console();
        FamilyGenerator familyGenerator=new FamilyGenerator();
        familyGenerator.generate();
        while (true){
            console.run();
        }
    }
}
