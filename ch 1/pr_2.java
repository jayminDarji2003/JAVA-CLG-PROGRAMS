/*
        formula to find EMI     
            emi = (p * r * Math.pow(r+1,t)) / (Math.pow(r+1,t) - 1);
        Formula to find simple interest.
            si = (p * r * n) /100;
 */

import java.util.*;

public class pr_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,r,t=5,emi;

        System.out.print("Enter principle amount : ");
        p = sc.nextDouble();

        System.out.print("Enter rate of interest : ");
        r = sc.nextDouble();

        r = r / (12 * 100); // converting to one month
        t = t * 12;     // converting to one month

        emi = (p * r * Math.pow(r+1,t)) / (Math.pow(r+1,t) - 1) ; 

        System.out.println("Monthly emi is : " + emi);
        sc.close();
    }
}
