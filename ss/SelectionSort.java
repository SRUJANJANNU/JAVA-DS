package ss;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i=0;i< arr.length;i++){
            int low = arr[i];
            for (int j=i+1;j< arr.length;j++){
                if(low > arr[j]){
                    int temp = low;
                    low = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i]=low;

        }
    }
}
