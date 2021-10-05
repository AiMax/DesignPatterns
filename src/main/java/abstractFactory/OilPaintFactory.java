package abstractFactory;

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
