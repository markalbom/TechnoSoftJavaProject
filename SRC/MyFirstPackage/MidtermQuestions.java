package MyFirstPackage;

import java.util.Arrays;

public class MidtermQuestions {
    public static void main(String[] args) {
        int [] originalArray = {1,2,7,6,8,7,7,19};


        //problem 1: first method (sort Array) --> error: array not sorted properly; yielding duplicates, and missing numbers
            System.out.println(Arrays.toString(sortArray(originalArray)));
        //problem 1: applying second method to first method --> strategy of helper method works, but is faulty bc of errors in first method
            System.out.println(missingNumber(sortArray(originalArray)));
        //problem 1: second attempt


        //problem 2: first attempt
            System.out.println(Arrays.toString(modifiedArray(originalArray, 7)));
        //problem 2: second attempt --> still yields 0 in place of removed elements
          System.out.println(Arrays.toString(modifyArray(originalArray, 7)));


        //problem 3:
        System.out.println(speedResults(88.3));



    }

    //1. Create a method to return missing smallest positive integer (greater than 0) from given array.
    //Example:
        //	For array : [1,3,5,4,2,7]
        //	Method should return : 6
        //	For array : [-1, -3, 4, 2]
        //	Method should return : 1
        //	For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
        //	Method should return : 6

//create 2 methods to solve this problem
//first method: sort the unsorted array
    public static int[] sortArray (int [] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];    //create empty array to store sortedNumbers

        for (int i = 0; i < unsortedArray.length-1; i++) {          //loop through unsortedArray, starting at 0 index position
            int lowestNumber = unsortedArray[i];                    //isolate currentNumber in loop
            for (int j = i + 1; j < unsortedArray.length; j++) {    //loop through unsortedArray a second time, starting at 1 index position
                int currentNumber = unsortedArray[j];
                if ((currentNumber < lowestNumber)) {                 //if currentNumber is less than the lowest number
                    lowestNumber = currentNumber;                   //set value of lowestNumber to current number
                    sortedArray[i] = currentNumber;
                } else {
                    sortedArray[i] = lowestNumber;
                    }
                }
            }
            return sortedArray;
        }



    public static int missingNumber(int [] sortedArray){
        int vanishedNum = 0;
        for (int i = 0; i < sortedArray.length-1; i++){   //loop though sorted array
            int currentNum = sortedArray[i];
            int nextNum = sortedArray[i+1];
            if ((currentNum + 1 != nextNum) && (currentNum -1 != sortedArray[i-1])){             //if currentNum + 1 does not equal the next num
                vanishedNum = currentNum + 1;          //vanishedNum = currentNum + 1
            }
        }
        return vanishedNum;
    }






    //2.  Write a Java program to remove a specific element from an array.
    //Example:
        // Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
            //remove int 24 from array
        //New Array: [32, 14, 98, 56, 148, 78]

    //1st attempt; able to create new array with removed element, but int 0 replaces the removed element at its index
    public static int [] modifiedArray (int [] originalArray, int var){
        int [] newArray = new int [originalArray.length];
        for (int i = 0; i < originalArray.length; i++){
            int currentNumber = originalArray[i];
            if (currentNumber != var){
                newArray[i] = originalArray[i];
            }
        }
        return newArray;
    }

    //2nd attempt; created count to tally number of times removed ele appears in original array; attempted to modify newArray length by removing total count from length
    public static int [] modifyArray(int [] originalArray, int var){
        int [] newArray = new int [originalArray.length];   //empty array has same length as the original array
        int varCount = 0;                                   //var count begins at 0
        int newArrayLength = newArray.length;               //create var newArrayLength that has value of newArray.length

        for (int i = 0; i < originalArray.length; i++){     //{1,1,2,3}
            int currentNum = originalArray[i];
            if (currentNum == var){                      //if currentNum = 1
                varCount ++;                            //increase varCount by 1
            }
            else if (currentNum != var){                 //if currentNum !== 1
                newArray[i] = originalArray[i];         //push ele into newArray
            }
        }
        newArrayLength = (originalArray.length - varCount);   //reassign length of newArray to remove # of times var ele has been removed
        return newArray;
    }



    //3. Traffic Ticketing System
        //speed limit base = 70
        //for every 5 mph over 70, add 1 point
        //use Math.floor(1.4) to round the speed to downward value
        //if user reaches or exceeds 12 points, then licence is suspended
        //return total point accumulation

        public static String speedResults(double userSpeed) {      //88.3
            int roundedUserSpeed = (int) Math.floor(userSpeed); //88
            int speedLimit = 70;
            if (roundedUserSpeed > speedLimit) {         //88 > 70
                int milesPerHourOver = roundedUserSpeed - speedLimit; //18
                int pointsAccumulated = (int) Math.floor((milesPerHourOver) / 5); //18/5 = 3.6 --> 3 (rounded down w Math.floor)
                if (pointsAccumulated > 12) {
                    return "you were " + milesPerHourOver + " miles per hour over the speed limit and have accumulated " + pointsAccumulated + " .  You have exceeded 12 points and your licence is revoked.";
                } else if (pointsAccumulated < 12) {
                    return "you were " + milesPerHourOver + " miles per hour over the speed limit and have accumulated " + pointsAccumulated + " points on your licence";
                    }
                }
            return ("you were driving within the speed limit");

        }

}
