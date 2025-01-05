package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(); // Basic Coffee
        coffee = new MilkDecorator(coffee); // Add Milk
        coffee = new SugarDecorator(coffee); // Add Sugar

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost());
    }
}
