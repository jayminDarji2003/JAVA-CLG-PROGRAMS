
class Overload{
    void areaOfSquare(int s){
        System.out.println("The area of square is : " + Math.pow(s, 2) + " sq units");
    }

    void areaOfRectangle(int x,int y){
        System.out.println("The area of rectangle is : " + x * y + " sq units");
    }
}


public class pr_6_2 {
    public static void main(String[] args) {
        Overload obj = new Overload();
        
        obj.areaOfSquare(10);
        obj.areaOfRectangle(10, 20);
    }
}
