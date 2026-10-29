public class Donuts {
    //"classes are blueprints for the things we want to make"
    //instance variable
    //todo: make these three comments into variables
    //frosting type
    public String frostingType;
    //is there a filling
    public boolean hasFilling;
    //number of donuts
    public int numberOfDonuts;


    //constructor
    //method - special
    //We don't write void
    //has to match the name of class exactly


    public Donuts(int pNumberOfDonuts){
        frostingType="Boston Creme";
        hasFilling=true;
        numberOfDonuts=pNumberOfDonuts;



    }//end of donut constructor
    //todo: make a method called printInfo
    public void printInfo(){
        //todo:use SOUT to print the instance variables
        System.out.println("The frosting type of this donut is "+frostingType);
        System.out.println("It is "+hasFilling+" that this donuts has a filling");
        System.out.println("There are "+numberOfDonuts+" donuts in this order");



    }//end of printInfo





}//end of donut class
