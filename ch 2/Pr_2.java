/*
    Q. Reverse an array
*/

public class Pr_2 {
    // print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // reverse array
    public static void reverseArray(int arr[]) {
        int temp;
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    // reverse fnx
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("------- Before reverse -------");
        printArray(arr);

        reverseArray(arr);
        System.out.println("------- After reverse -------");
        printArray(arr);
    }
}
