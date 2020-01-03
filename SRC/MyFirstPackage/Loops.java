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

//        for (int i = 0; i < 100; i++){      //initializer (where does the loop begin), condition (run code until), incrementer (increment during each iteration)
//            System.out.println(i);
//        }
//
//        //Exercise 2.  Write a for-loop that prints from 100, descends in steps of 5
//
//        for (int i = 100; i > 0; i = i - 5){
//            System.out.println(i);
//        }

        //Exercise 3.  Write a for-loop that will reverse a string

        String name = "Mark";                   // "Mark"
        String reversedName = "";              //empty string to hold the results
        char [] strArr = name.toCharArray();  // [M, a, r, k]

        for (int i = strArr.length - 1; i >= 0; i--){    //begin i at the last element in the array (the 3rd element, not "k"); while i is greater than 0 (number of elements in the array)
            reversedName = reversedName + strArr[i];
        }
        System.out.println(reversedName);


//        char [] arrName = name.split("");
//        for (int = arrName[0]; i < arrName.length; i++){
//            System.out.println(i);
//        }


        //Exercise 3.  Write a for loop that checks to see if a string is a palindrome
        String word = "racecar";
        String reversedWord = "";
        char [] stringArray = word.toCharArray();
        for (int i = stringArray.length -1; i >= 0; i--){
            reversedWord = reversedWord + stringArray[i];
        }
        System.out.println(reversedWord);
        if (word.equals(reversedWord)){
            System.out.println("this word is a palindrome");
        } else {
            System.out.println("this is not a palindrome");
        }


    }
}
