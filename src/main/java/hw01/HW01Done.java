package hw01;

import java.util.Scanner;

public class HW01Done {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        int a=(int)(Math.random()*(100+1));
        boolean exit=true;
        Scanner in=new Scanner(System.in);
        System.out.print("Input your name, please: ");
        String name=in.nextLine();
        while (exit) {

            System.out.print("Input your number: ");
            int number=in.nextInt();

            if (number < a) {
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (number > a) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                System.out.println("Congratulations: " + name);exit=false;
            }

        }

    }
}
