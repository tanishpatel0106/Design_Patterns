package Creational.Builder;
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }
    @Override
    public float price() {
        return 100.5f;
    }
}
