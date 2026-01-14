public class TestGeometricObject {
    public static void main(String[] args) {
        System.out.println("=== Geometric Objects Test ===\n");
        
        // Test Circles
        System.out.println("=== Circle Comparison ===");
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(7.5, "blue", false);
        
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Larger circle: " + GeometricObject.max(circle1, circle2));
        
        // Test Cylinders
        System.out.println("\n=== Cylinder Comparison ===");
        Cylinder cylinder1 = new Cylinder(3.0, 10.0, "green", true);
        Cylinder cylinder2 = new Cylinder(4.0, 8.0, "yellow", false);
        
        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Larger cylinder (by area): " + GeometricObject.max(cylinder1, cylinder2));
        
        // Test ComparableCylinder (compare by volume)
        System.out.println("\n=== ComparableCylinder Comparison (by volume) ===");
        ComparableCylinder compCylinder1 = new ComparableCylinder(2.0, 5.0, "orange", true);
        ComparableCylinder compCylinder2 = new ComparableCylinder(3.0, 4.0, "purple", false);
        
        System.out.println("ComparableCylinder 1: " + compCylinder1);
        System.out.println("ComparableCylinder 2: " + compCylinder2);
        
        int comparison = compCylinder1.compareTo(compCylinder2);
        if (comparison > 0) {
            System.out.println("Cylinder 1 is larger than Cylinder 2 by volume");
        } else if (comparison < 0) {
            System.out.println("Cylinder 2 is larger than Cylinder 1 by volume");
        } else {
            System.out.println("Both cylinders have equal volume");
        }
        
        ComparableCylinder largerCylinder = ComparableCylinder.max(compCylinder1, compCylinder2);
        System.out.println("Larger ComparableCylinder: " + largerCylinder);
        
        // Test Colorable interface
        System.out.println("\n=== Colorable Interface Test ===");
        Square square = new Square(5.0, "purple", true);
        System.out.println("Square: " + square);
        square.howToColor();
        
        // Polymorphism with Colorable
        System.out.println("\n=== Polymorphism with Colorable ===");
        Colorable[] colorableObjects = new Colorable[2];
        colorableObjects[0] = square;
        colorableObjects[1] = new Square(3.0, "red", false);
        
        for (Colorable obj : colorableObjects) {
            obj.howToColor();
        }
        
        // Array of GeometricObjects demonstrating polymorphism
        System.out.println("\n=== Array of GeometricObjects ===");
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = cylinder1;
        shapes[3] = compCylinder1;
        shapes[4] = square;
        
        double totalArea = 0;
        for (GeometricObject shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + 
                             " - Area: " + String.format("%.2f", shape.getArea()));
            totalArea += shape.getArea();
        }
        System.out.println("Total area of all shapes: " + String.format("%.2f", totalArea));
        
        // Find the largest shape in the array
        GeometricObject largest = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].compareTo(largest) > 0) {
                largest = shapes[i];
            }
        }
        System.out.println("\nLargest shape in array: " + largest.getClass().getSimpleName() + 
                          " with area: " + String.format("%.2f", largest.getArea()));
    }
}