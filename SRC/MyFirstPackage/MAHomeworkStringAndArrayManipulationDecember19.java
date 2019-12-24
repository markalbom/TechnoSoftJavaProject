package MyFirstPackage;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MAHomeworkStringAndArrayManipulationDecember19 {
    public static void main(String[] args) {
        String myStatement = "I am a good programmer";

        //1 (string)
        // extract "programmer" from myStatement
           String [] extractedWords = myStatement.split(" ");
           System.out.println(Arrays.toString(extractedWords));
           System.out.println(extractedWords[4]);


        //display the total number of words in myStatement
            String [] totalWords = myStatement.split(" ");  //create totalWords array, which has value of myStatement, split on the " "
            int totalWordCount = totalWords.length;            //create totalWordCount var (expect an int result), which has value of totalWords array length
            System.out.println(totalWordCount);

        //replace all the 'r' characters with 'f' characters
            String replaced = myStatement.replace("r","f");
            System.out.println(replaced);


        //2 (string)
        //  store your name into a string variable
            String myName = "Mark";
        //  determine length of myName without using length() method
            System.out.println(myName.toCharArray().length);


        //3 (arrays)
        String [] names = {"Mohammad", "John", "Ferdious", "Abul", "Ratna", "Mareeha", "Ruslan", "Himani"};

        //verify that "John" is present at index 1
            Boolean isJohnAtIndex1 = names[1].equalsIgnoreCase("John");
            System.out.println(isJohnAtIndex1);


        //4 (arrays)
        String [] friends = {"Max", "Mike", "Justin", "Ryan", "David"};

        // determine the length of the array
            System.out.println(friends.length);

        // print the name written in the 3rd position (2nd index)
            System.out.println(friends[2]);

        // print the names of all friends
            System.out.println(friends.toString());
            System.out.println(Arrays.toString(friends));

        // does the name in the 2nd position (1st index) start with 'A'?
            boolean startsWithA = friends[1].startsWith("A");
            System.out.println(startsWithA);
    }
}
