import java.util.Scanner;

public class pr_3 {
    public static void main(String[] args) {
        System.out.println("Enter :- 1 for -> Seat cover");
        System.out.println("Enter :- 1 for -> Steering wheels cover");
        System.out.println("Enter :- 1 for -> Car lighting");
        System.out.println("Enter :- 1 for -> Air purifires");
        System.out.println("Enter :- 1 for -> Other items");

        double price,tax,total,tax_rate;
        // String item;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();

        System.out.print("Enter price : ");
        price = sc.nextDouble();


        switch(ch){
            case 1:
                tax_rate = 0.02;
                tax = price * tax_rate;
                total = price + tax;
                System.out.println("Price is : " + price);
                System.out.println("Tax is : " + tax);
                System.out.println("Total price of seat cover is : " + total);
                break;
                
            case 2:
                tax_rate = 0.03;
                tax = price * tax_rate;
                total = price + tax;
                System.out.println("Price is : " + price);
                System.out.println("Tax is : " + tax);
                System.out.println("Total price of steering wheel cover is : " + total);
                break;

            case 3:
                tax_rate = 0.04;
                tax = price * tax_rate;
                total = price + tax;
                System.out.println("Price is : " + price);
                System.out.println("Tax is : " + tax);
                System.out.println("Total price of car light is : " + total);
                break;

            case 4:
                tax_rate = 0.025;
                tax = price * tax_rate;
                total = price + tax;
                System.out.println("Price is : " + price);
                System.out.println("Tax is : " + tax);
                System.out.println("Total price of air purifires is : " + total);
                break;

            case 5:
                tax_rate = 0.015;
                tax = price * tax_rate;
                total = price + tax;
                System.out.println("Price is : " + price);
                System.out.println("Tax is : " + tax);
                System.out.println("Total price of other items is : " + total);
                break;


            default:
                System.out.println("Invalid case");

        }
        sc.close();
    }
    
}