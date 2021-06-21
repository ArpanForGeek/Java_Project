package arrays;

public class MaxIndex {

    public static void main(String[] args) {


        int arr[] = {2, 4, 6, 99,7, 1, 56, 65, 21};

        int max = 0;

        for (int i = 1;i<arr.length;i++ ){
            if(arr[i]>arr[max]){
                max =  i;
            }
        }

        System.out.println(max);
        System.out.println(arr[max]);
    }
}
