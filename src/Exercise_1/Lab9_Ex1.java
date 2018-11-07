
package Exercise_1;

import java.util.Scanner;

public class Lab9_Ex1 {

    
    public static void main(String[] args) {
        int lines = lines();
        stars(lines);
    }
    //Class scanner object...
    static Scanner scan = new Scanner(System.in);
    //User input method...
    public static int lines(){
        int x;
        System.out.print("Enter the number lines: ");
        while(!scan.hasNextInt()){
            if (scan.nextInt()<= 0){
                System.out.println();
                System.out.print("Please enter a positive integer: ");
            }            
        }
        x =scan.nextInt();
        return x;
    }

    //This is a recursion method...
    public static void stars(int a){
        int c = a;
        if (c > 1) { 
            for(int b =a; b >= 1; b--){
                System.out.print("*");
            }
            System.out.println();
            c--;
            stars(c);
        }
        
        
    }
}
