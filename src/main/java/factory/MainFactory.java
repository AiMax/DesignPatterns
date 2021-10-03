package factory;

public class MainFactory {
    public static void main(String[] args) {
        Shop shop = new Bakery();
        System.out.println(shop.getProduct().getProduct());
    }


}
