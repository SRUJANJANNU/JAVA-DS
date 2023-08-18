package ss;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = s.nextInt();
        int i;
        int[] arr = new int[n];
        System.out.println("enter Elements:");
        while (n-- >0){
            arr[n] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i=0; i< arr.length;i++){
            swapped = false;
            for (int j=1; j< arr.length-1;j++){
                if (arr[j-1] > arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}
