package hw03;

import java.util.Scanner;

public class HW03Done {
    public static void main(String[] args) {
        String[][] schedule=new String[7][2];
        schedule[0][0]="Sunday ";
        schedule[0][1]="do home work";
        schedule[1][0]="Monday ";
        schedule[1][1]="go to courses; watch a film";
        schedule[2][0]="Tuesday ";
        schedule[2][1]="practicing";
        schedule[3][0]="Wednesday ";
        schedule[3][1]="go to courses; read a book";
        schedule[4][0]="Thursday ";
        schedule[4][1]="do home work; practice a lot";
        schedule[5][0]="Friday ";
        schedule[5][1]="go to courses;";
        schedule[6][0]="Saturday ";
        schedule[6][1]="take a break and relax";
        System.out.print("Please, input the day of the week: \n");
        boolean exit=true;
        while (exit){
            Scanner in =new Scanner(System.in);
            String day=in.nextLine();
            String dayCheck = day.toLowerCase();
            switch (dayCheck.trim()){

            case "sunday":
            System.out.println("Your task for "+schedule[0][0]+": "+schedule[0][1]);
            break;

            case "monday":
            System.out.println("Your task for "+schedule[1][0]+": "+schedule[1][1]);
            break;

            case "tuesday":
            System.out.println("Your task for "+schedule[2][0]+": "+schedule[2][1]);
            break;

            case "wednesday":
            System.out.println("Your task for "+schedule[3][0]+": "+schedule[3][1]);
            break;

            case "thursday":
            System.out.println("Your task for "+schedule[4][0]+": "+schedule[4][1]);
            break;

            case "friday":
            System.out.println("Your task for "+schedule[5][0]+": "+schedule[5][1]);
            break;

            case "saturday":
            System.out.println("Your task for "+schedule[6][0]+": "+schedule[6][1]);
            break;

            case "exit":
                exit=false;
                break;

            default:
                System.out.println("Please, input the day of the week for proceeding or exit for stopping : ");
                break;
            }

        }
    }
}
