import java.util.Scanner;

public class pr_5 {
    public static void main(String[] args) {
        double hypotenous,x,y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        x = sc.nextDouble();

        System.out.print("Enter value of y : ");
        y = sc.nextDouble();
            
        // first way
        hypotenous = Math.sqrt((x * x) +(y * y));
        
        // second way of formula
       // hypotenous = Math.sqrt(Math.pow(x, 2) +Math.pow(x, 2));

        System.out.println("The hypotenous is : " + hypotenous);

        sc.close();
    }
}
