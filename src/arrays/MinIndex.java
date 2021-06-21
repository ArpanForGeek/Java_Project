package arrays;

public class MinIndex {
    public static void main(String[] args) {

        int arr[] = {1,8,90,11,12,3};
        int min = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }

        System.out.println(min);
        System.out.println(arr[min]);

    }
}
