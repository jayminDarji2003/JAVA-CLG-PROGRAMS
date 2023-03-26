
/*
    Question 6
*/
import java.util.*;

class NumberData {
    int arr[] = new int[5];

    public void setArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter data = ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}

class NumPlay extends NumberData {
    // print fnx
    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // sum of array
    public int sumArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Average of numbers
    public int avgArray(int arr[]) {
        int sum = sumArray(arr);
        return sum / arr.length;
    }

    // max of array
    public int maxArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // min of array
    public int minArray(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

public class Pr_6 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1 };
        NumPlay n = new NumPlay();

        while (true) {
            System.out.println();
            System.out.println("1. Print Array");
            System.out.println("2. sum Array");
            System.out.println("3. Average of Array");
            System.out.println("4. Max of Array");
            System.out.println("5. Min of Array");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    n.printArray(arr);
                    break;
                case 2:
                    System.out.println("Sum of array = " + n.sumArray(arr));
                    break;
                case 3:
                    System.out.println("Average of array = " + n.avgArray(arr));
                    break;
                case 4:
                    System.out.println("Max of array = " + n.maxArray(arr));
                    break;
                case 5:
                    System.out.println("Min of array = " + n.minArray(arr));
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Enter valid number");
            }

            sc.close();
        }
    }
}
