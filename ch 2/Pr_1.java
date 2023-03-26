/*
    Q. Sorting one dimentional Array.
*/

class Pr_1 {
    // sort an array
    public static void sort(int arr[]) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
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

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5, 9, 7, 8 };
        System.out.println("--- Before sorting -----");
        printArray(arr);
        System.out.println("--- After sorting -----");
        sort(arr);
        printArray(arr);
    }
}