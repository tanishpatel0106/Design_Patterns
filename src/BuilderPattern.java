import Creational.Builder.*;
public class BuilderPattern {
    public static void main(String [] args){
        MealBuilder mb1 = new MealBuilder();
        Meal vegMeal = mb1.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        Meal nonvegMeal = mb1.prepareNonVegMeal();
        nonvegMeal.showItems();
        System.out.println("Total Cost: " + nonvegMeal.getCost());
    }
}
