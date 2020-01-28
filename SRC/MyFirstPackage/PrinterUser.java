package MyFirstPackage;

import org.w3c.dom.ls.LSInput;

public class PrinterUser {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(20);
        myPrinter.viewTonerLevel();
        myPrinter.modifyTonerLevel(80);
        //myPrinter.print("single", 5);
        myPrinter.printSummary();
        myPrinter.print("single", 10);
        myPrinter.printSummary();
        myPrinter.viewTonerLevel();
        myPrinter.print("double", 10);
        myPrinter.printSummary();
        myPrinter.viewTonerLevel();
        myPrinter.viewTonerLevel();
////        myPrinter.printSummary();
//        myPrinter.print("double", 20);
//        myPrinter.viewTonerLevel();
//        myPrinter.printSummary();
//        myPrinter.viewTonerLevel();



//        myPrinter.print("double", 20);
//        myPrinter.viewTonerLevel();

//        myPrinter.printSingle(7);
//        myPrinter.viewTonerLevel();
//        myPrinter.print(true,5);
//        myPrinter.viewTonerLevel();

    }
}
