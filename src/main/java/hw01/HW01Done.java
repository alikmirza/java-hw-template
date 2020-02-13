package hw01;

import java.util.Scanner;

public class HW01Done {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        int a=(int)(Math.random()*(100+1));
        int count=0;

        while (count<=100) {

            Scanner in=new Scanner(System.in);
            int name=in.nextInt();

            if (name < a) {
                System.out.println("Your number is too small. Please, try again.");count++;
            }
            else if (name > a) {
                System.out.println("Your number is too big. Please, try again.");count++;
            }
            else if(count==100){
                System.out.println("There is no attempt, you lose!");break;
            }
            else {
                System.out.println("Congratulations, " + name);break;
            }

        }

    }
}
