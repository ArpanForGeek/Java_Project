package arrays;

public class SelectionSort {

    public static void main(String[] args) {


        int arr[] = {12, 98, 4, 2, 77, 45, 10};

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
