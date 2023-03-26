/*
    Q.5 :- find sum and average of two numbers using interface
*/

// creating interface called Numbers
interface numbers {
    int process(int x, int y);
}

// creating class called Sum
class sum implements numbers {
    public int process(int x, int y) {
        System.out.println("The sum of two numbers is : " + (x + y));
        return x + y;
    }
}

// creating class called Average
class average implements numbers {
    public int process(int x, int y) {
        System.out.println("The average of two numbers is : " + (x + y) / 2);
        return (x + y) / 2;
    }
}

public class Pr_5 {
    public static void main(String[] args) {
        sum s = new sum();
        s.process(10, 20);
        average avg = new average();
        avg.process(55, 77);
    }
}
