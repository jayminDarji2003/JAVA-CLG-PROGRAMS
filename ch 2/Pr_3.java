/*
    Q. Calculate sum of two matresis 
*/

public class Pr_3 {

    // print array
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // sum of two matresis
    public static int[][] sum(int arr1[][], int arr2[][] , int sum[][]) {
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] += arr1[i][j] + arr2[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum[][] = new int[3][3];

        System.out.println("----- Array 1 ------");
        printArray(arr1);
        System.out.println("----- Array 2 ------");
        printArray(arr2);

        System.out.println("---------- sum array -------");
        printArray(sum(arr1, arr2, sum));
    }
}
