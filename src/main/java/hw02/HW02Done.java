package hw02;

import java.util.Arrays;
import java.util.Scanner;

public class HW02Done {
    public static void main(String[] args) {
        String [][]array=new String[5][5];
        System.out.printf(" 0  | 1  | 2  | 3  | 4  |\n");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]="  - |";
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int index1=(int)(Math.random()*(4+1));
        int index2=(int)(Math.random()*(4+1));
        boolean exit=true;

        while (exit){

            Scanner in=new Scanner(System.in);
            System.out.print("Input positions with space between them: ");
            int k=in.nextInt();
            int l=in.nextInt();


            if(k==index1 && l==index2) {
                System.out.printf("  0  | 1  | 2  | 3  | 4  |\n");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[index1][index2] = "  @ |";
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You have won!");
                exit=false;
            }
            else {
                System.out.printf("  0  | 1  | 2  | 3  | 4  |\n");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[k][l] = "  * |";
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
            }

        }
    }
}
