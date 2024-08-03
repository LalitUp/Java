// there are two types of delaring values or other details
// first one is give the values in the programm
// and second is the taking input from the user


import java.util.Scanner;

public class Input_Output02 {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name Please:");

        String Name = input.nextLine();

        System.out.println("Your Name is " + Name);


    }
    
}
