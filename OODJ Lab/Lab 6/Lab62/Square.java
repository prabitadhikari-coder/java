public class Square extends GeometricObject implements Colorable {
    private double side;
    
    public Square() {
        super();
        side = 1.0;
    }
    
    public Square(double side) {
        super();
        this.side = side;
    }
    
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    
    @Override
    public void howToColor() {
        System.out.println("How to color this square: Color all four sides");
    }
    
    @Override
    public String toString() {
        return "Square [Side=" + side + ", Area=" + getArea() + 
               ", Perimeter=" + getPerimeter() + "]";
    }
}