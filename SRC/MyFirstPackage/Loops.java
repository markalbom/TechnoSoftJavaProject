package MyFirstPackage;

public class Loops {
    public static void main(String[] args) {

        //INT MUST BE USED FOR LOOPS; IT IS A COUNTER AND THE ONLY DATA TYPE YOU CAN USE TO ITERATE THROUGH THE LOOP!!
        //WHILE LOOP

          //Exercise 1.  count up to 100
//          int count = 0;
//          while(count <= 100){
//            System.out.println("count:" + count);
//            count++;
//          }

//        //Exercise 2.  count down from 100 to 0
//          int count = 100;
//          while(count > 0){
//            System.out.println("count:" + count);
//            count --;
//          }

//        //Exercise 3.  count up from 0 to 100 and print only the even numbers
//            int count = 0;
//            while(count <= 100){  //while the count is less than or equal to 100
//                if (count % 2 == 0){  //if the count (current number) is even (remainder of zero when using mod)
//                    System.out.println(count);  //print the current count
//                }
//                count++;   //increment the count by 1, OUTSIDE OF THE IF STATEMENT;
//            }


        //DO-WHILE LOOP
//        int count = 0;
//        do {
//            System.out.println("count is:" + count);
//            count++;
//        } while (count < 5);


        //FOR-LOOPS
            // Exercise 1. Count up to 100

        for (int i = 0; i < 100; i++){      //initializer (where does the loop begin), condition (run code until), incrementer (increment during each iteration)
            System.out.println(i);
        }
//
//        //Exercise 2.  Write a for-loop that prints from 100, descends in steps of 5
//
        for (int i = 100; i > 0; i = i - 5){
            System.out.println(i);
        }

        //Exercise 3.  Write a for-loop that will reverse a string

        String name = "Mark";                   // "Mark"
        String reversedName = "";              //empty string to hold the results
        char [] strArr = name.toCharArray();  // [M, a, r, k]

        for (int i = strArr.length - 1; i >= 0; i--){    //begin i at the last element in the array (the 3rd element, not "k"); while i is greater than 0 (number of elements in the array)
            reversedName = reversedName + strArr[i];
        }
        System.out.println(reversedName);


//        char [] arrName = name.split(""); -- another way to split string into a char array
//


        //Exercise 3.  Write a for loop that checks to see if a string is a palindrome
        String word = "racecar";
        String reversedWord = "";
        char [] stringArray = word.toCharArray();
        for (int i = stringArray.length -1; i >= 0; i--){
            reversedWord = reversedWord + stringArray[i];
        }
        System.out.println(reversedWord);
        if (word.equals(reversedWord)){     //better to use 'equals' rather than 'matches' re: java doc keywords
            System.out.println(word + " and " + reversedWord + " " + "are palindromes");
        } else {
            System.out.println(word + " and " + reversedWord + " " + "are not palindromes");
        }
// alternative method:

        // return word.equals(reversedWord)


        //HW
          //1.  based on the percentage you find, assign a letter value to the student


    double score = 24;  //needs to be double to be able to calculate the average (int will only yield integer 0 every time)
    double maxScore = 25;
    double percentage = (score / maxScore) * 100;

    if (percentage <= 59){
        System.out.println("your average is " + percentage + " " + "and so you have received an \'F\'");
    } else if (percentage >= 60 && percentage <= 69){
        System.out.println("your average is " + percentage + " " + "and so you have received an \'D\'");
    } else if (percentage >= 70 && percentage <= 79){
        System.out.println("your average is " + percentage + " " + "and so you have received an \'C\'");
    } else if (percentage >= 80 && percentage <= 89){
        System.out.println("your average is " + percentage + " " + "and so you have received an \'B\'");
    } else if (percentage >= 90 && percentage <= 100){
        System.out.println("your average is " + percentage + " " + "and so you have received an \'A\' - congratulations!");
    } else {
        System.out.println("you have entered an incorrect percentage");
    }

//3.  Write logic to check to see if a number is a prime number
        int number = 7;
        for (int i = 2; i < number; i++){  //i has to begin at 2 since 1 is a prime number;
            if (number % i == 0){
                System.out.println(number + " is not a prime number");
            } else {
                System.out.println(number + " is a prime number");
            }
        }

    }
}




