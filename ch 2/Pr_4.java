/*
    Q. Fetch lowest price in array.
*/

public class Pr_4 {
    public static void main(String[] args) {
        String name[] = { "Sumit", "Parth", "Keval", "Sahil", "yes" };
        int price[] = { 55, 45, 65, 85, 95 };

        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if(lowest > price[i]){
                lowest = price[i];
            }
        }

        System.out.println(lowest);

        for(int i=0; i<name.length; i++){
            if(price[i] == lowest){
                System.out.println("Name of company is : " + name[i] +  " and price is  : " + lowest);
            }
        }
    }
}
