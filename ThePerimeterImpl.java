public class ThePerimeterImpl implements ThePerimeterInterface{

    @Override
    public double ThePerimeterOfRectangle(Rectangle rectangle) {
        // TODO Auto-generated method stub
        return 2 * (rectangle.getHeight() + rectangle.getWidth());
    }

    @Override
    public double ThePerimeterOfCircle(Circle circle) {
        // TODO Auto-generated method stub
        return 2 * circle.getRadius() * 3.14;
    }
    
}
