public class Pizza {
    public boolean hasCheese;
    public String hasToppings;
    public int numberofPizzas;

    public Pizza(){
        hasCheese = true;
        hasToppings = "Cheese, Tomato Sauce, Pepperoni";
        numberofPizzas = 1;

    }//end of pizza constructor

    //todo: add the instance variable you made to the top of the class

    //todo: make a constructor that gives the instance variables default variables. No variables

    //todo: make a printInfo method

    //todo: in printInfo, print the instance variables in a readable way

    public void printInfo(){
        System.out.println("Pizza has toppings: " + hasToppings);
        System.out.println("It is " + hasCheese + " that the pizza has cheese");
        System.out.println("There are " + numberofPizzas + " pizzas");

    }//end of printInfo method
}//end of Pizza class