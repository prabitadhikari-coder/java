public class ComparableCylinder extends Cylinder {
    
    public ComparableCylinder() {
        super();
    }
    
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }
    
    public ComparableCylinder(double radius, double height, String color, boolean filled) {
        super(radius, height, color, filled);
    }
    
    public int compareTo(ComparableCylinder o) {
        return Double.compare(this.getVolume(), o.getVolume());
    }
    
    public static ComparableCylinder max(ComparableCylinder c1, ComparableCylinder c2) {
        return (c1.compareTo(c2) >= 0) ? c1 : c2;
    }
}