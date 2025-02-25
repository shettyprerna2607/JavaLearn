package Java_OOPS;
class Square{
    int side;
    void SideLength(int side){
        this.side = side;

    }
    int CalculateArea(){
        return side * side;
    }
    int CalculatePerimeter(){
        return 4 * side;
    }
}
class Rectangle{
    int l;
    int w;
    void sideLength(int l,int w){
        this.l = l;
        this.w = w;
    }
    int calculateArea(){
        return l * w;
    }
    int calculatePerimeter(){
        return 2 * (l + w);
    }
}
class Circles{
    int radius;
    Circles(int radius){
        this.radius = radius;
    }
    double calculateArea(){
        return 3.14 * radius * radius;    //instead of 3.14 u can give MATH.PI
    }
    double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
}

public class Shapes {
    public static void main(String[] args){
        Square sqr = new Square();
        sqr.SideLength(2);
        System.out.println("Area  of Square: "+ sqr.CalculateArea());
        System.out.println("Perimeter  of Square: "+ sqr.CalculatePerimeter());

        Rectangle rect = new Rectangle();
        rect.sideLength(2, 4);
        System.out.println("Area of Rectangle: "+ rect.calculateArea());
        System.out.println("Perimeter of Rectangle: "+ rect.calculatePerimeter());

        Circles circle = new Circles(2);
        System.out.println("Area of Circle:"+ circle.calculateArea());
        System.out.println("Perimeter of Circle: "+ circle.calculatePerimeter());

    }
}
