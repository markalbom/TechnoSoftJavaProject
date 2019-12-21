package MyFirstPackage;

public class MyJavaClass {
    public static void main(String[] args) {    //pvsm = public static void shortcut
        System.out.println("hello world");     // sout = system out print shortcut,  println = "print line"


        byte dogAge = 12;

        short myShort = 4423;

        int accountBalance = 4325678;

        long anotherAccountBalance = 343853842372L;  //include 'L' at end of value to explicitly tell Java that this is a long data type

        float averageAge = 33.2f;   //include 'f' at the end of the  value to explicitly tell Java this is a float data type

        double average = 88.99;     //functions the same as 'float'; but is used more commonly;  takes up more space as float


        boolean isDoorClosed = false; //declare 'isDoorClosed' variable, set value to 'false';


        char firstInitial = 'M'; //string data type is huge, a char is MUCH smaller, so use a char for one character;


        //below is HW assignment 2 (which primitive data types would you assign to each)

        byte legalDrinkingAge = 21; //small number; can use a byte;
        System.out.println("The legal drinking age in the US is" + legalDrinkingAge);

        int averageMonthlySalary = 100000; //larger number; may use an integer;
        System.out.println("A QA engineer in America makes an average annual salary of " + averageMonthlySalary);

        int earthMoonDistance = 221681; //larger number; may use an integer;
        System.out.println("The distance between the Earth and the Moon is" + earthMoonDistance);

        long nationalAmericanDebt = 23126244360000L; //long because its a very long number;
        System.out.println("The US national debt is" + nationalAmericanDebt);

        float chaseInterestRate = 0.11f; // is a small number with decimal point;
        System.out.println("The Chase bank interest rate is" + chaseInterestRate);

        double coatPrice = 29.99;  //double because is probably a larger number, used more commonly than float;
        System.out.println("The price of this coat is" + coatPrice);

        boolean areYouFemale = false; //boolean because is a T/F answer
        System.out.println("Are you a female?" + areYouFemale);


        char secondInitial = 'A';
        System.out.println("Your name initials are " + firstInitial + secondInitial);

        String firstName = "John";
        String lastName = "Adams";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String message = "this is \"my\" message";



        //in-class work Thurs 12/19

        //STRING METHODS
        //Declare string var 'my statement
        String myStatement = "I am a good programmer";
        System.out.println(myStatement);

        //find length of myStatement
        int myStatementLength = myStatement.length();
        System.out.println("the number of characters in the statement is:" + " " + myStatementLength);

        //convert all values of myStatement to lowerCase
        String myStatementLower = myStatement.toLowerCase();
        System.out.println(myStatementLower);

        //see if myStatement includes "Mohammad"
        boolean includesMohammad = myStatement.contains("mohammad");
        System.out.println("does the statement include the word \"Mohammad\"?:" + " " + includesMohammad);

        //find the 5th index of myStatement
        char fifthIndex = myStatement.charAt(5);
        System.out.println("The char at the fifth index position of the statement is:" + " " + fifthIndex);

        //find if the statment is empty
        boolean isEmpty = myStatement.isEmpty();
        System.out.println("is the statement empty?:" + " " + isEmpty);

        //compare myStatement with 'technosoft'
        //ONLY use equals instead of matches when comparing strings
        boolean isTechnosoft = myStatement.matches("technosoft");
        System.out.println("does statement include \"technosoft\" (using matches method):" + " " + isTechnosoft);

        boolean includesTechnosoft = myStatement.equals("technosoft");
        System.out.println("does statement include \"technosoft\" (using equals method):" + " " + includesTechnosoft);


        //check is myStatement starts with "welcome"
        boolean startsWithWelcome = myStatement.startsWith("Weclome");
        System.out.println("Does statement start with \"Welcome?\":" + " " + startsWithWelcome);

        //check is myStatement ends with "Goodbye"
        boolean endsWithGoodBye = myStatement.endsWith("Goodbye");
        System.out.println("Does statement end with \"Goodbye?\":" + " " + endsWithGoodBye);



        //ARRAYS

        //try to name your arrays in plural to remind yourself / others that it is an array (dealing with more than one)
        String[] cars = new String[5];
        // declare cars array with a string data type
        // instantiate a new string array with a value of / capacity of five

        cars[0] = "Tesla";
        cars[1] = "Honda";
        cars[2] = "Kia";
        cars[3] = "Audi";
        cars[4] = "BMW";

        int size = cars.length;  //a variable called 'size' that is an integer data type - variable has a value of the length of the array
        System.out.println("the array length is:" + size);

        boolean isEqual = cars[4].equalsIgnoreCase("Bmw");

        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        String [] days = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri"};



    }
}





