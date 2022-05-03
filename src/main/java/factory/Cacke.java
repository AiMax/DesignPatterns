package factory;

public class Cacke implements Product{
    @Override
    public String getName() {
        return "Cacke";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getProduct() {
        return "You get a " + getName() + " for " + getPrice() + " euro(s).";
    }
}
