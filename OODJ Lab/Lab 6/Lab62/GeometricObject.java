public abstract class GeometricObject implements Comparable<GeometricObject> {
    protected String color;
    protected boolean filled;
    protected java.util.Date dateCreated;
    
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }
    
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
    public java.util.Date getDateCreated() { return dateCreated; }
    
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
    
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
    
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + 
               " and filled: " + filled;
    }
}