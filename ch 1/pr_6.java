import java.util.Scanner;

public class pr_6 {

    public static float area(Float s){
        return  s*s;
    }

    public static float area(Float h,Float w){
        return  h*w;
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        float side,height,width;

        System.out.print("Enter side : ");
        side = sc.nextFloat();

        System.out.print("Enter height : ");
        height = sc.nextInt();

        System.out.print("Enter width : ");
        width = sc.nextInt();

        // area = area(side);
        // area = area(height,width);

        System.out.println("The area of square is : " + area(side));
        System.out.println("The area of rectengle is : "+ area(height,width));



        sc.close();
    }
}





