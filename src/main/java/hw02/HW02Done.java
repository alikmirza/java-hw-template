package hw02;

import java.util.Scanner;



public class HW02Done {

    public static void main(String[] args) {
        String [][]array=new String[5][5];
        int border=1;
        System.out.printf("    |  1  | 2  | 3  | 4  | 5  |\n");
        for (int i=0;i<array.length;i++){
            System.out.printf("| %d |",border);border++;
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
            System.out.print("Input numbers with the space between 1-5: ");
            if(!in.hasNextInt()){
                String input=in.nextLine();
                System.out.printf(" {%s} - is not a valid number.\n",input);
                continue;
            }
            int k=in.nextInt();
            int l=in.nextInt();

            if (k<1 || k>5 || l<1 || l>5 ){
                continue;
            } k--;l--;

            border=1;

            if(k==index1 && l==index2) {
                System.out.printf("    | 1  | 2  | 3  | 4  | 5  |\n");
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("| %d |",border);border++;
                    for (int j = 0; j < array[i].length; j++) {
                        array[index1][index2] = "  x |";
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You have won!");
                exit=false;
            }
            else {border=1;
                System.out.printf("    | 1  | 2  | 3  | 4  | 5  |\n");
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("| %d |",border);border++;
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
