public class TheAreaImpl implements ThePerimeterInterface{

    @Override
    public double ThePerimeterOfRectangle(Rectangle rectangle) {
        // TODO Auto-generated method stub
        double area = rectangle.getHeight() * rectangle.getWidth();
        return area;
    }

    @Override
    public double ThePerimeterOfCircle(Circle circle) {
        // TODO Auto-generated method stub
        return circle.getRadius() * circle.getRadius() * 3.14;
    }
    
}
