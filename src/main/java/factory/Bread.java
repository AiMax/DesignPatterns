package factory;

public class Bread implements Product{
    @Override
    public String getName() {
        return "Baguette";
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getProduct() {
        return "You get a " + getName() + " for " + getPrice() + " euro(s).";
    }
}
