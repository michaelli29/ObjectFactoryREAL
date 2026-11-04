public class Burgers {
    public boolean hasCheese;
    public String hasToppings;
    public int numberofBurgers;
    public boolean pizza;


    public Burgers(){
        hasCheese = false;
        hasToppings = "Cheese, Lettuce, Tomatoes, Meat Patty,";
        numberofBurgers = 1;


    }//end of burgers constructor

//todo: add the instance variable you made to the top of the class


//todo: make a constructor that gives the instance variables default variables. No variables

//todo: make a printInfo method

//todo: in printInfo, print the instance variables in a readable way


    public void printInfo(){
        System.out.println("Burgers has toppings: " + hasToppings);
        System.out.println("It is "+ hasCheese + " that the burger has cheese");
        System.out.println("There are " + numberofBurgers+ " burgers");



    }//end of printInfo method
}//end of Burgers class