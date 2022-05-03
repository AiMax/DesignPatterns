package abstractFactory.factory;

import abstractFactory.brush.Brush;
import abstractFactory.brush.OilBrush;
import abstractFactory.color.Color;
import abstractFactory.color.OilColor;

public class OilPaintFactory implements PaintFactory{
    @Override
    public Color getColor() {
        return new OilColor();
    }

    @Override
    public Brush getBrush() {
        return new OilBrush();
    }
}
