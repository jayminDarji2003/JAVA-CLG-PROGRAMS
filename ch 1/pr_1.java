import java.util.Scanner;

public class pr_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        int p = sc.nextInt();

        System.out.print("Enter Rate of interest : ");
        float r = sc.nextFloat();

        System.out.print("Enter time : ");
        float t = sc.nextFloat();

        float simpleInterest = (p * r * t)/100;
        System.out.println("The simple interest is : " + simpleInterest);

        sc.close();

    }
}