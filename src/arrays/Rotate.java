package arrays;

public class Rotate {
    public static void main(String[] args) {

        int k = 45;

        int arr[] = {1,2,3,4,5,6,7,8};

        k= k % arr.length;
        rotate(arr,arr.length-k,arr.length-1);
        rotate(arr,0,(arr.length-k)-1);
        rotate(arr,0,arr.length-1);

        for(int j : arr){
            System.out.print(j+" ");
        }

    }

    public static void rotate(int[] arr, int i, int j){
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
