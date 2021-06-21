package arrays;

import javax.swing.plaf.synth.ColorType;

public class SwapElement {
    public static void main(String[] args) {

        int arr[] = {1,3,4,5,6,7};
        int other[] ={5,3,4,7,8,9};
        //swap(arr,0,1);
        swap1(arr,other);
//        for(int n : arr){
//            System.out.print(n+" ");
//        }
    }

    public static void swap(int arr[] , int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void swap1(int arr[],int other[]){
        int[] temp = arr;
        arr= other;
        other = temp;
        for(int n : other){
            System.out.print(n+" ");
        }
    }
}
