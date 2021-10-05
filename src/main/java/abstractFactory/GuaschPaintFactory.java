package abstractFactory;

public class GuaschPaintFactory implements  PaintFactory{
    @Override
    public Color getColor() {
        return new MetalicColor();
    }

    @Override
    public Brush getBrush() {
        return new MetalicBrush();
    }
}
