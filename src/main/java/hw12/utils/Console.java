package hw12.utils;

import hw12.controller.FamilyController;
import hw12.domain.*;
import hw12.exception.FamilyOverflowException;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Console {

    private FamilyGenerator familyGenerator=new FamilyGenerator();

    private void myPrint(String message){ System.out.print(message); }
    public static long parseStringToLocalDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (Objects.nonNull(date) && !date.trim().isEmpty()) {
            try {
                return  LocalDate.parse(date, dateTimeFormatter).
                        atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            } catch (DateTimeParseException ex) {
                System.err.println(ex.getMessage());
                return 0;
            }
        } else return 0;
    }

    public void enterInfoOfFather(){
        Scanner in=new Scanner(System.in);
        System.out.println("Please, input name, surname, birthday(ex: 11/11/1990), iq of Father and input enter after each of them)");
        String name=in.nextLine();
        String surname=in.nextLine();
        long birthDate = parseStringToLocalDate(in.nextLine());
        int iq=in.nextInt();
        familyGenerator.createMan(name,surname,birthDate,iq);
    }
    public void enterInfoOfMother(){
        Scanner in=new Scanner(System.in);
        System.out.println("Please, input name, surname, birthday(ex: 11/11/1990), iq of Mother and input enter after each of them)");
        String name=in.nextLine();
        String surname=in.nextLine();
        long birthDate = parseStringToLocalDate(in.nextLine());
        int iq=in.nextInt();
        familyGenerator.createWoman(name,surname,birthDate,iq);
    }



    public void run(){

        myPrint("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" +
                "* Please, select one of the following commands by number  *\n" +
                "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" +
                "*  [1] Create families                                    *\n" +
                "*  [2] Get all families                                   *\n" +
                "*  [3] Get all families, which members more than          *\n" +
                "*  [4] Get all families, which members less than          *\n" +
                "*  [5] Get all families, which members equals to          *\n" +
                "*  [6] Create new family                                  *\n" +
                "*  [7] Delete family by index                             *\n" +
                "*  [8] Update family by index                             *\n" +
                "*  [9] Delete all children, whom age more than            *\n" +
                "*  [10] Exit                                              *\n" +
                "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" +
                "\n--->\n");


        FamilyController familyController=new FamilyController();
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        switch (number){
            case 1:
                familyGenerator.generate();
                break;
            case 2:
                System.out.println(familyController.displayAllFamilies());
                break;
            case 3:
                System.out.println("Please, enter the number of people: ");
                if (in.hasNextInt()){
                    int amount=in.nextInt();
                    try {
                        System.out.println(familyController.getFamiliesBiggerThan(amount));
                    }catch (FamilyOverflowException ex){
                        System.err.println(ex.getMessage());
                    }
                }else System.out.println("Your input is not valid");
                break;
            case 4:
                System.out.println("Please, enter the number of people: ");
                if (in.hasNextInt()){
                    int amount=in.nextInt();
                    try {
                        System.out.println(familyController.getFamiliesLessThan(amount));
                    }catch (FamilyOverflowException ex){
                        System.err.println(ex.getMessage());
                    }
                }else System.out.println("Your input is not valid");
                break;
            case 5:
                System.out.println("Please, enter the number of people: ");
                if (in.hasNextInt()){
                    int amount=in.nextInt();
                    try {
                        System.out.println(familyController.countFamiliesWithMemberNumber(amount));
                    }catch (FamilyOverflowException ex){
                        System.err.println(ex.getMessage());
                    }
                }else System.out.println("Your input is not valid");
                break;
            case 6:
                enterInfoOfFather();
                enterInfoOfMother();
                familyGenerator.createFamily();
                break;
            case 7:
                System.out.println("Please, input the index of family: ");
                if (in.hasNextInt()){
                    int index=in.nextInt();
                    try {
                        System.out.println(familyController.getFamilyByIndex(index));
                    }catch (FamilyOverflowException ex){
                        System.err.println(ex.getMessage());
                    }
                }else System.out.println("Your input is not valid");
                break;
            case 8:
                myPrint("Please, select one of the following commands by number: \n" +
                        "\t[1] - Born child\n" +
                        "\t[2] - Adopt child\n" +
                        "\t[3] - Go to the main menu\n" +
                        "--->");
                int input=in.nextInt();
                if (input==1) {
                    System.out.println("Enter the id of family: ");
                    int id=in.nextInt();
                    System.out.println("Enter name for boy: ");
                    String nameforBoy=in.next();
                    System.out.println("Enter name for girl: ");
                    String nameForGirl=in.next();
                    familyController.bornChild(id,nameforBoy,nameForGirl);
                }
                else if (input==2){
                    System.out.println("Enter the id of family: ");
                    int id=in.nextInt();
                    enterInfoOfFather();
                    familyController.adoptChild(id,familyGenerator.getAnotherMan());
                }else return;
                break;
            case 9:
                System.out.println("Please, input the age: ");
                int age=in.nextInt();
                familyController.deleteAllChildrenOlderThen(age);
                break;
            case 10:
                System.exit(0);
                break;

        }



    }
}
