
package Exercise_1;

import java.util.Scanner;

public class Lab9_Ex1 {

    public static void main(String[] args) {
        lines();        
    }
    
    //Class scanner object...
    static Scanner scan = new Scanner(System.in);
    //User input method...
    /**
    * The lines method is used to get input from the 
    * user about how many lines of stars to print out
    * to the console. The method uses a while loop that
    * loops while an int variable is less than or eqaul
    * to 0. Within that while loop there is a print
    * statement that prompts the user for input. That 
    * input is stored into a string variable and a try
    * catch method is executed to try to parse the string 
    * into an integer. If the string variable can be 
    * parsed into an integer an if statement is executed
    * to check the value of the integer. If the integer
    * value is less than or equal to 0 a print statement
    * is printed to the console else the while loop is 
    * exited because the integer value is greater than 0.
    * If the string variable value can't be parsed into 
    * an integer a print statement is printed to the 
    * console. Once the while loop is exited an if/else 
    * statement checks the value of the int variable. If
    * the value of the int variable is greater 0 the 
    * stars recursive method is called passing the int 
    * variable in as its parameter, else the lines 
    * method is called once again.
    */
    public static void lines(){
        String lines;
        int x = 0;
        while (x <= 0) {
            System.out.print("Enter the number lines: ");
            lines = scan.nextLine();
            System.out.println();
            try {
                x = Integer.parseInt(lines);
                if( x<= 0){
                System.out.println("Enter a 'POSITIVE' number!\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry! Enter a number greater than 0!\n");
            }
        }
        if (x > 0) {
            System.out.println();
            stars(x);
        }else{
            System.out.println();
            lines();
        }
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
