/*
Q.8 :- print discount and net price 

1000 == price ---> 10% discount
1000 to 1500 price ---> 12% discount
1500 >= price ---> 15% discount

*/
import java.util.Scanner;

public class pr_8 {
    public static void discount(Double price){
        double discount , netPrice;

        if(price < 1000){
            discount = 0.10;
            netPrice = price - (price * discount);
            System.out.println("Net price is : " + netPrice);
        }
        else if(price > 1000 && price < 1500){
            discount = 0.12;
            netPrice = price - (price * discount);
            System.out.println("Net price is : " + netPrice);
        }
        else {
            discount = 0.15;
            netPrice = price - (price * discount);
            System.out.println("Net price is : " + netPrice);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your price : " );
        double price = sc.nextDouble();
        discount(price);
        sc.close();
    }
}
