/* there are several decision making statements like
if, if-else
if-else-if
nested-if
switch case 
jump etc...
 */

 // let's start


import java.util.Scanner;

public class Decision_Making03 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter First Value: ");  // enter the first value
            int num1 = input.nextInt();                   // this statement take the value from the user
 
            System.out.print("Enter Second Value: ");
            int num2 = input.nextInt();

            if( num1> num2){
                System.out.println("Mahindra");
            } 
            else {
                System.out.println("Massey");
            }
        }






    }
    
}
