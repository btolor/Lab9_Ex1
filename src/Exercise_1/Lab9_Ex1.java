
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
        int x;
        System.out.print("Enter the number lines: ");
        x =scan.nextInt();
        while(x < 1){         
            System.out.print("Please enter a positive integer: ");
            x = scan.nextInt();
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
