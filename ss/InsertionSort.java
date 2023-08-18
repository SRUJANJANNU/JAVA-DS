package ss;

import java.util.Arrays;
import java.util.Scanner;

import static Arrays.SwapArr.swap;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j> 0;j--){
            if(arr[j]>=arr[j-1]){
                swap(arr,j,j-1);
            }
            else {
            break;
             }

          }
        }
    }
}
