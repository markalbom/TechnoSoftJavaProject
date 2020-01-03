package MyFirstPackage;

import java.sql.SQLOutput;

public class SwitchStatement {

    public static void main(String[] args) {

    char grade = 'X';   //use single quote when using char data type
    switch (grade) {
        case 'A':
            System.out.println("Excellent work");
            break;
        case 'B':
        case 'C':
            System.out.println("Well done");
            break;
        case 'D':
            System.out.println("You passed");
        case 'F':
            System.out.println("Try Again");
        default:
            System.out.println("Invalid grade");
    }

        //CLASS EXERCISE:  Use a switch statement to align the month with a season

        String month = "May";
         switch (month){
             case "December":
             case "January":
             case "February":
                 System.out.println("the month of" + " " + month + " " + "occurs in winter");
                 break;
             case "March":
             case "April":
             case "May":
                 System.out.println("the month of" + " " + month + " " + "occurs in spring");
                 break;
             case "June":
             case "July":
             case "August":
                 System.out.println("the month of" + " " + month + " " + "occurs in summer");
                 break;
             case "September":
             case "October":
             case "November":
                 System.out.println("the month of" + " " + month + " " + "occurs in autumn");
                 break;
             default:
                 System.out.println("you have entered an unknown month");
         }
    }
}
