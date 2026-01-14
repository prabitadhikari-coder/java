public class Cylinder extends Circle {
    private double height;
    
    public Cylinder() {
        super();
        height = 1.0;
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        // Surface area of cylinder
        return (2 * Math.PI * getRadius() * height) + 
               (2 * super.getArea());
    }
    
    public double getVolume() {
        return super.getArea() * height;
    }
    
    @Override
    public String toString() {
        return "Cylinder [Radius=" + getRadius() + ", Height=" + height + 
               ", Surface Area=" + String.format("%.2f", getArea()) + 
               ", Volume=" + String.format("%.2f", getVolume()) + "]";
    }
}