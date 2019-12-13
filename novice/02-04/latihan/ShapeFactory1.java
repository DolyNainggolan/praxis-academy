public class ShapeFactory1 extends AbstractFactory
{
    @Override 
    public Shape getShape (String shapeType)
    {
        if (shapeType.equalsIgnoreCase ("RECTANGLE"))
        {
            return new Rectangle();
        }
        else  if (shape.Type.equalIgnoreCase ("SQUARE"))
        {
            return new Square();
        }
        return null;
    }
}