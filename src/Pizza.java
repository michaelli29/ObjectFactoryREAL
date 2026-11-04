public class Pizza {
    public boolean hasCheese;
    public String hasToppings;
    public int numberofPizzas;

    public Pizza(){
        hasCheese = true;
        hasToppings = "Cheese, Tomato Sauce, Pepperoni";
        numberofPizzas = 1;

    }//end of pizza constructor
    

    public void printInfo(){
        System.out.println("Pizza has toppings: " + hasToppings);
        System.out.println("It is " + hasCheese + " that the pizza has cheese");
        System.out.println("There are " + numberofPizzas + " pizzas");

    }//end of printInfo method
}//end of Pizza class
