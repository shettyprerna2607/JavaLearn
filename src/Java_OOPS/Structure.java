package Java_OOPS;

class Cylinder {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate surface area
    public void surfaceArea() {
        double SA = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        System.out.println("Surface area of the cylinder is: " + SA);
    }

    // Method to calculate volume
    public void Volume() {
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder is: " + vol);
    }
}

class Rectangles {
    private double length;
    private double breadth;

    // Constructor Overloading: Default Constructor
    public Rectangles() {
        this.length = 4;
        this.breadth = 5;
    }

    // Constructor Overloading: Parameterized Constructor
    public Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}

public class Structure {
    public static void main(String[] args) {
        // Cylinder Object
        Cylinder cylinder = new Cylinder(0.37, 5.08);
        System.out.println("Radius of the cylinder is: " + cylinder.getRadius());
        System.out.println("Height of the cylinder is: " + cylinder.getHeight());
        cylinder.surfaceArea();
        cylinder.Volume();

        // Rectangle Object using Default Constructor
        Rectangles defaultRectangle = new Rectangles();
        System.out.println("Default Rectangle - Length: " + defaultRectangle.getLength());
        System.out.println("Default Rectangle - Breadth: " + defaultRectangle.getBreadth());

        // Rectangle Object using Parameterized Constructor
        Rectangles customRectangle = new Rectangles(10, 20);
        System.out.println("Custom Rectangle - Length: " + customRectangle.getLength());
        System.out.println("Custom Rectangle - Breadth: " + customRectangle.getBreadth());
    }
}
