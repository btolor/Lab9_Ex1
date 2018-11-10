
package Exercise_1;

import java.util.Scanner;

public class Lab9_Ex1 {

    
    public static void main(String[] args) {
        lines();
        
    }
    //Class scanner object...
    static Scanner scan = new Scanner(System.in);
    //User input method...
    public static void lines(){
        String lines;
        int x = 0;
        System.out.print("Enter the number lines: ");
        lines = scan.nextLine();
        try {
            x = Integer.parseInt(lines);
        } catch (Exception e) {
            System.out.println("Please enter a valid number!\n");
            lines();
        }
   
        stars(x);
    }

    //This is a recursion method to print out the star pattern...
    public static void stars(int a){
        if (a > 0){
            for (int i = 0; i < a; i++){
                System.out.print("*");
            }
                System.out.println();
            stars (a - 1);
            for (int i = a; i > 0; i--){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
