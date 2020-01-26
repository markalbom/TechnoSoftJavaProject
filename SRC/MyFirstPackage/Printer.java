package MyFirstPackage;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private int pageAllotment;


    //Constructor method to define toner level and page allotment when creating toner object
    //User can enter toner level between 1 and 100
    //User begins with page allotment of 100
    Printer (int tonerLevel){
        if (tonerLevel > 100) {
            System.out.println("this toner level exceeds the maximum.  Please set toner level between 0 and 100");
        } else if (tonerLevel < 0) {
            System.out.println("this toner level is not high enough.  Please set toner level above 0 and below 100");
        } else {
            System.out.println("your initial toner level is " + (this.tonerLevel = tonerLevel));
        }
        pageAllotment = 100;
    }


    //create method that allows user to modify the toner level --> accepts int variable as argument
    //current toner level + modified toner level again must be set between 0 and 100
    public void modifyTonerLevel(int modifiedTonerLevel){
        if (tonerLevel + modifiedTonerLevel > 100) {
            System.out.println("this toner level exceeds the maximum.  Please set toner level between 0 and 100");
        } else if (tonerLevel + modifiedTonerLevel < 0) {
            System.out.println("this toner level is not high enough.  Please set toner level above 0 and below 100");
        } else {
            System.out.println("you have just added " + modifiedTonerLevel + " to the toner.  Your updated toner level is " + (this.tonerLevel = tonerLevel + modifiedTonerLevel)); // updated tonerLevel = currentTonerLevel + modifiedTonerLevel
        }
    }

    //create method that allows user to view the current toner level
    // 1:1 ratio of toner to page
    public void viewTonerLevel(){
        int revisedTonerLevel = (tonerLevel - printedPages);
        System.out.println("your current toner level: " + (revisedTonerLevel));
        if (revisedTonerLevel < 1){
            System.out.println("your current toner level is less than one.  low toner, please add more toner");
        }
    }

    //create method that allows user to view their print summary
    //view total number of pages printed
    //view total number of pages remaining
    public void printSummary () {
        System.out.println("you have printed a total of " + this.printedPages + " pages");
        System.out.println("you have " + this.pageAllotment + " pages remaining");
        if (this.pageAllotment == 1){
            System.out.println("you have one page remaining.  Please add more paper");
        }
    }


    //create method that allows users to print
    //accepts string 'single' or 'double' for type of print, and int for number of pages to be printed
        //if single --> update total printed pages (field var), update total page allotment (field var)
        //if double -> user prints double page (printed page / 2), (toner * 2)

    public void print (String var, int printedPages) {
        if (var == "single") {                                                                 //if user chooses single page print
            this.printedPages = this.printedPages + printedPages;                              //update field var of printedPages to include local var printedPages (what you are passing in)
            System.out.println("you have just printed " + printedPages + " single pages");
            this.pageAllotment = this.pageAllotment - printedPages;
        } else if (var == "double"){                                                           //else if user chooses double page print
            this.printedPages = ((this.printedPages + printedPages) / 2);
            this.tonerLevel = (this.tonerLevel + tonerLevel) / 2;
            System.out.println("you have just printed " + (printedPages / 2) + " double-sided pages");
            this.pageAllotment = (this.pageAllotment - printedPages) / 2;
        }
        }
}

