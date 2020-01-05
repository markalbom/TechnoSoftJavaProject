package MyFirstPackage;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ConditionalOperators {

    public static void main(String[] args) {

        //Create an age variable and set your age to it
        int age = 32;

        //Calculate if person is a child (if they are 7 or under)
        boolean isPersonAChild = age <= 7;
        System.out.println(isPersonAChild);

        //Calculate if person is a senior (if they are 65 or over)
        boolean isPersonASenior = age >= 65;
        System.out.println(isPersonASenior);


        //Farenheit to Celsius Conversion Calculator

        //declare farenheit temp variable
        double farenheitTemperature = 68;

        //calculate celsius and store into a celsius
        double celsiusTemperature = (farenheitTemperature - 32) * 5 / 9;
        System.out.println(celsiusTemperature);

        //calculate kelvin and store into variable
        //T(K) = (60
        double kelvinTemperature = (farenheitTemperature + 459.67) * 5 / 9;
        System.out.println(kelvinTemperature);

        //calculate celsius to kelvin
        double kelvinTemperatureRevised = (celsiusTemperature + 273.15);
        System.out.println(kelvinTemperatureRevised);

        //calculate celsius to farenheit
        double farenheitTemperatureRevised = (celsiusTemperature * 9 / 5) + 32;
        System.out.println(farenheitTemperatureRevised);

        //calculate kelvin to celsius
        double CelsiusTemperatureFromKelvin = (kelvinTemperatureRevised - 273.15);
        System.out.println(CelsiusTemperatureFromKelvin);


        //classwork for conditional statements:
        //int temp = 45
        //if temp is 32 or lower, then print "it is freezing outside"
        //if temp is 100 or higher, then print "it is hot outside"
        //if both statements are false, then print "go for it, it is pretty outside"

        int temperature = 45;
        if (temperature <= 32) {
            System.out.println("it is freezing outside");
        } else if (temperature >= 100) {
            System.out.println("it is hot outside");
        } else {
            System.out.println("go for it, it is pretty outside");
        }


        //if customer has $1000 or more on the checking account and iphone is available in the inventory, then display an alert saying
        //you can go to the store to purchase the iphone
        //if customer has a credit score is greater than 600 or customer has $1000 or more in the checking account, then display alert saying
        //you are eligible to purchase the iphone
        //if none of the above conditions are true, then display alert saying "you are not eligible for the iphone"

        double userCheckingBalance = 50;
        double userCreditScore = 500;
        boolean isPhoneAvailable = true;    //you can also set iPhoneAvailable to 'int' data-type, and give it numerical value (10), then in statement say if var is less than 0,

        if (userCheckingBalance >= 1000 && isPhoneAvailable) {
            System.out.println("you can go to store to purchase the iPhone");
            //JOptionPane.showMessageDialog(parentComponent: null; message: "you can purchase the iphone");
        } else if (userCheckingBalance >= 1000 || userCreditScore > 600) {
            System.out.println("you are eligible to purchase the iPhone");
        } else {
            System.out.println("you are not eligible for the iPhone");
        }


        //nested if-conditons - will only run if it hits the first (outer) if condition


        //HW
        //1. Menu
        //are both vegan?  only offer up a vegan menu
        //at least one vegan? make sure you offer some vegan options
        //if anything else, offer full menu

        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

        if (isGuestOneVegan && isGuestTwoVegan) {
            System.out.println("here is our all-vegan menu");
        } else if (isGuestOneVegan || isGuestTwoVegan) {
            System.out.println("here is our partially-vegan menu");
        } else {
            System.out.println("here is our full (meat-included) menu");
        }

        //2. Driver Control -- if / else statement
        //I want to be able to put car on P mode, D mode, N mode, and R mode
        //If I am on P mode, and parking type is parallel, then I can park between 2 cars
        //If I am on D mode, I can put drive type to Snow, Sport, or Regular type
        //If I am on N mode, I can put car into car-wash station
        //If i am on R mode, I can only reverse the car and car will activate the rear-view camera

        boolean isModeP = true;
        String parkingType = "parallel";
        boolean isModeD = true;
        boolean isModeN = true;
        boolean isModeR = true;

        if (isModeP && parkingType.equals(parkingType)) {
            System.out.println("you can park between 2 cars");
        } else if (isModeD) {
            System.out.println("please choose drive type: Snow, Sport or Regular");
        } else if (isModeN) {
            System.out.println("you can put the car into the car-wash station");
        } else if (isModeR) {
            System.out.println("you can reverse the car and activate rear-view camera");
        }


        //3. Store a number in an int variable
        //if the number is divisible by 15, display "the number is divisible by 15"
        //otherwise, display the remainder you get when you divide by 15

        int number = 28;
        double numberRemainder = (number % 15);

        if (number / 15 == 0) {
            System.out.println(number + " " + "is divisible by 15");
        } else {
            System.out.println(numberRemainder);
        }


        //4.  Store your name in a variable
        //if your name length comes out greater than 8, display your name after replacing all 'a' to 'A' from your name
        //otherwise, display your name in uppercase

        String name = "Mark";
        int nameLength = name.length();

        if (nameLength > 8) {
            System.out.println(name.replace('a', 'A'));
        } else {
            System.out.println(name.toUpperCase());
        }


        //5.  Create an array of 5 int values.  Calculate the average of those 5 values (do not use a for-loop)
            //if avg is greater than 25, display array from 0 index to last
            //otherwise, display array from last index to 0 index

        int[] numberArray = {5, 19, 79, 89, 95};
        int total = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3] + numberArray[4];
        int average = total / numberArray.length;

        if (average > 25) {
            System.out.println(Arrays.toString(numberArray));
        } else {
            System.out.println(numberArray[4] + numberArray[3] + numberArray[2] + numberArray[1] + numberArray[0]);
        }


//        6. Create a supermarket item finder
//        Take input from user and based on the input, you should display user which aisle has the item
//        For example: user enter milk, you program should say aisle 8. If the item is not found,
//        display a message saying "Out of stock "Please create program for below requirement
//                Milk = Aisle Eight
//                Eggs = Aisle Eight
//                French Fries = Aisle seven
//                Candy = Aisle Three
//                Frozen Pizza = Aisle seven
//                Donuts = Aisle Eight
//                Diapers = Aisle One
//                Apple = Aisle two
//                Orange = Aisle two

        String item = "Milk";

        switch (item){
            case "Milk":
            case "Eggs":
            case "Donuts":
                System.out.println("your item is in aisle eight");
                break;
            case "French Fries":
            case "Frozen Pizza":
                System.out.println("your item is in aisle seven");
                break;
            case "Candy":
                System.out.println("your item is in aisle three");
                break;
            case "Diapers":
                System.out.println("your item is in aisle one");
                break;
            case "Apple":
            case "Orange":
                System.out.println("your item is in aisle two");
                break;
        }


//SCOPE
// field scope (java specific) (AKA global scope in js) - accessed anywhere in the class
// local scope - defined and accessed in a code block

    }
}





