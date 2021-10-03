package factory;

public class Bakery implements Shop {
    @Override
    public Product getProduct() {
        return new Bread();
    }
}
