import java.util.Locale;

public class Pizza {
    // Instance Variables
    private final String pizzaSize;
    private final int cheese;
    private final int pepperoni;
    private final int mushroom;

    // Constructor
    public Pizza(String pizzaSize, int cheese, int pepperoni, int mushroom) {
        this.pizzaSize = pizzaSize;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushroom = mushroom;
    }

    // Method to calculate the cost of the pizza
    public double calculateCost() {
        int baseCost = 0;
        switch (pizzaSize.toLowerCase()) {
            case "small":
                baseCost = 500;
                break;
            case "medium":
                baseCost = 650;
                break;
            case "large":
                baseCost = 800;
                break;
            default:
                System.out.println("Invalid pizza size");
                return 0;
        }
        int toppingCost = (cheese + pepperoni + mushroom) * 25;
        return baseCost + toppingCost;
    }


    // Method to return the pizza description
    public String pizzaDescription() {
        return "Size: " + pizzaSize + ", Cheese: " + cheese + ", Pepperoni: " + pepperoni +
                ", Mushroom: " + mushroom + ", Cost: Rs." + calculateCost();
    }

    // Main method for testing
    public static void main(String[] args) {
        Pizza myPizza = new Pizza("Medium", 2, 3, 1);
        System.out.println(myPizza.pizzaDescription());
    }
}
