package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.factory.GuaschPaintFactory;
import abstractFactory.factory.OilPaintFactory;
import abstractFactory.factory.PaintFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        PaintFactory factory = new OilPaintFactory();
        PaintFactory leroyMerlin = new GuaschPaintFactory();
        Color housePaint = factory.getColor();
        System.out.println(housePaint.getColor());
        housePaint = leroyMerlin.getColor();
        System.out.println(housePaint.getColor());
    }
}
