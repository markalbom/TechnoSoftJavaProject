package MyFirstPackage;

import java.util.Arrays;

public class MethodsHW {
    public static void main(String[] args) { //main method is always 'static' in declaration
        //problem 1
        System.out.println(reverseStringFrontToBack("howdy"));
        System.out.println(reverseStringBackToFront("courage"));

        //problem 2-8
        int[] bn = {1,2,3,4,5};
        int[] fn = {7,21,89,30};
        System.out.println(Arrays.toString(reverseArray(bn)));
        System.out.println(sumArray(bn));
        //System.out.println(Arrays.toString(sortedArray(fn)));
        System.out.println(arrayAverage(bn));
        System.out.println(highestNumber(bn));
        System.out.println(lowestNumber(bn));
        System.out.println(abbreviation("outfit of the day"));

       //problem 9
        String [] students = {"Happy", "Peace", "Jesse", "Kaitlin", "John", "Donald"};
        int [] grades = {90,89,91,67,87,88};

      //temperature conversions
        System.out.println(celsiusToKelvin(70.3));
        System.out.println(celsiusToFahrenheit(78.8));
        System.out.println(kelvinToCelsius(321.8));
        System.out.println(kelvinToFahrenheit(297.8));







    }

    //1.  create a method that reverses a string
        //reversing the string w/ dynamic length, starting from the front of string and moving forward
        public static String reverseStringFrontToBack(String var) {
            String myString = var;
            String reversed = "";
            int stringLength = var.length();

            //reversed = reversed + myString.charAt(stringLength-1 - 0); --> e
            //reversed = reversed + myString.charAt(stringLength-1 -1) --> es
            //reversed = reversed + myString.charAt(stringLength-1 -2) --> esr
            //the only thing that is changing here becomes your 'i' in the for loop

            for (int i = 0; i <= stringLength-1; i++) {
                reversed = reversed + var.charAt(stringLength-1 - i);

            }
            return reversed;
        }

        //reversing the string w/ dynamic length, starting from the back and moving backwards
        public static String reverseStringBackToFront(String var) {
            String myOtherString = var;
            String myOtherReversed = "";
            int myOtherStringLength = var.length();

            for (int i = myOtherStringLength-1; i >= 0; i--) {
                myOtherReversed = myOtherReversed + var.charAt(i);
            }

            return myOtherReversed;
        }

//      //2.  create a method that reverses an array
            public static int [] reverseArray (int[] originalArray){
            int originalArrayLength = originalArray.length; //grab the length of the originalArray, store into variable
            int[] reversedArray = new int[originalArrayLength];  //create empty array to store reversed numbers


            //int [] newArray = new int [4]; //create a new array called newArray that has a length of 4; anything you put in the bracket will define the length of the array

            for (int i = originalArrayLength-1; i >= 0; i--) {
                //reversedArray[i] = originalArray[originalArrayLength-1 -i];
                reversedArray[originalArrayLength-1 -i] = originalArray[i];
            }

            return reversedArray;

        }

          //3. create a method that adds all numbers in a given array
            public static int sumArray (int[] array){
                int sum = 0;
                for (int i = 0; i < array.length; i++){
                    sum += array[i];

                }
                return sum;
            }


//        //4. create a method that sorts a given array
//            public static int [] sortedArray (int[] unsortedArray) {
//                int[] resortedArray = new int[unsortedArray.length];
//                for (int i = 0; i < unsortedArray.length; i++) {
//
//                    int currentNum = unsortedArray[i];
//                    int nextNum = unsortedArray[i +1];
//                    if (currentNum < nextNum) {
//                        resortedArray[] += currentNum;
//                    }
//
//                }
//                return resortedArray;
//            }

          //5. create a method that finds the average of a given array
               public static int arrayAverage (int [] array){
               int sum = 0;
               for (int i = 0; i < array.length; i++){
                   sum += array[i];

               }
                   int average = (sum / array.length);
                   return average;
            }

          //6. create a method that finds the highest number in a given array
               public static int highestNumber (int [] array){
               int highestNumber = array[0];        //set the initial high number to the first ele in the array; then compare each ele to that first one
               for (int i = 0; i < array.length; i++){
               int currentNumber = array[i];
               if (currentNumber > highestNumber){
                   highestNumber = currentNumber;
                    }
                }
               return highestNumber;
               }

          //7. create a method that finds the smallest number in a given array
            public static int lowestNumber (int [] array){
            int lowestNumber = array[0];           //same thing here; set lowest number to the first ele in array, then compare each following ele to that first one
            for (int i = 0; i < array.length; i++){
                int currentNumber = array[i];
                if (currentNumber < lowestNumber){
                    lowestNumber = currentNumber;
                }
            }
            return lowestNumber;
            }

          //8. create a method that creates an abbreviation for any given string
            public static String abbreviation (String sentence){
            String abbreviatedString = "";
            String[] splitSentence = sentence.split(" ");
            for (int i = 0; i < splitSentence.length; i++){
               String word = splitSentence[i];
                abbreviatedString += word.charAt(0);
            }
            return abbreviatedString.toUpperCase();  //toUpperCase is a string method, so you cannot use it on charAt (which gives you a char)
            }

//          //9. create a method that takes 2 arrays of equal length (students + grades), and returns names of students who scored the highest marks;
//            public static String bestStudents (String [] students){
//            for (int i = 0; i < students.length; i++){
//                String student = students[i];
//
//
//                }
//            }

            //temperature conversion methods

            //method that converts celsius to kelvin
            public static double celsiusToKelvin(double celsius){
            double kelvin = (celsius + 273.15);
            return kelvin;
            }

            //method that converts celsius to fahrenheit
            public static double celsiusToFahrenheit(double celsius){
            double fahrenheit = (celsius * 9/5) + 32;
            return fahrenheit;
            }

            //method that converts kelvin to celsius
            public static double kelvinToCelsius(double kelvin){
            double celsius = (kelvin - 273.15);
            return celsius;
            }

            //method that converts kelvin to fahrenheit
            public static double kelvinToFahrenheit(double kelvin){
            double fahrenheit = (kelvin * 9/5) - 459.67;
            return fahrenheit;
            }



//public static void calculateResult

        //public - who can access this
        //static - this method belongs to this class (the static class)
        //void   - this method is not returning anything, its not returning data, just printing
        // int, string, etc - in lieu of void, put the data type that the method is going to return
        //calculateResult - name of the method




}
