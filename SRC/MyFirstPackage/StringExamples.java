package MyFirstPackage;

import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // declare new variable called 'scanner' (a scanner data type), create a new instance of the Scanner object
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("My name is" + name);

    }
}
