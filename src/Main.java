import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter age to see if eligible to vote");
            int age = input.nextInt();
            validate(age);


    }

    static void validate(int age){
        if(age<18)
            System.out.println("You are ineligible to vote");
        else
            System.out.println("You are eligible to vote");
    }
}