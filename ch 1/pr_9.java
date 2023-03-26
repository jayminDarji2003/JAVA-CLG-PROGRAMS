class Bank {
    Bank() {
        double deposit = 5000, r = 6.5;
        int t = 5;
        double ans = deposit * Math.pow((1 + r / 12), (t * 12));
        System.out.println("Total amount is : " + ans);
    }
}

public class pr_9 {
    public static void main(String[] args) {
       // Bank obj = new Bank();
    }
}
