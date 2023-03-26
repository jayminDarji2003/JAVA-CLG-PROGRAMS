/*
    Practical 9 : last practical of this chapter
*/

abstract class Calculation{
    double height, width;

    Calculation(double height, double width){
        this.height = height;
        this.width = width;
    }
    abstract double area();
}

class Rectangle extends Calculation{
    // consructor
    Rectangle(double h, double w){
        super(h,w);
    }

    double area(){
        return height * width;
    }
}

class Triangle extends Calculation{
    // consructor
    Triangle(double h, double w){
        super(h,w);
    }

    double area(){
        return 0.5 * height * width;
    }
}


public class Pr_9 {
    public static void main(String[] args) {
        Calculation cl;
        Rectangle r = new Rectangle(10, 30);
        cl = r;
        System.out.println("Area of Rectangle is : " + cl.area());

        Triangle t = new Triangle(10, 30);
        cl = t;
        System.out.println("Area of Triangle is : " + cl.area());
    }
}
