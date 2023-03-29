public class p_11 {

    // reverse fnx
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    // array sort
    public static void sort(int arr[]) {
        // bubble sort
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // print array
    public static void printArray2(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // sum of 2d array
    public static int[][] sum(int arr[][], int arr2[][]) {
        int n = arr.length;
        int sum[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 20, 3, 4, 5 };
        int arr2[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr3[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum[][] = new int[3][3];
        sum = sum(arr2, arr3);
        printArray2(sum);

        // System.out.println(arr2.length);
        // printArray(arr);
        // sort(arr);
        // printArray(arr);

    }
}