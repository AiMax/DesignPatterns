package abstractFactory.factory;

import abstractFactory.brush.Brush;
import abstractFactory.color.Color;

public interface PaintFactory {
    Color getColor();
    Brush getBrush();
}

