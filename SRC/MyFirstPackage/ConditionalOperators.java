package MyFirstPackage;

import java.sql.SQLOutput;

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


    }
}


