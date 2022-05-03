package abstractFactory.factory;

import abstractFactory.brush.Brush;
import abstractFactory.brush.MetallicBrush;
import abstractFactory.color.Color;
import abstractFactory.color.MetallicColor;

public class GuaschPaintFactory implements  PaintFactory {
    @Override
    public Color getColor() {
        return new MetallicColor();
    }

    @Override
    public Brush getBrush() {
        return new MetallicBrush();
    }
}
