package ss;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = s.nextInt();
        int i;
        int[] arr = new int[n];
        System.out.println("enter Elements:");
        for (i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter key Element:");
        int key = s.nextInt();
        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        System.out.println("max ele: "+arr[len-1]);
        if(arr[0]<arr[len-1]) {
            int ans = binSrcI(arr, key);
            System.out.println("Element found at index " + ans);
        }
        else {
            int ans = binSrcD(arr, key);
            System.out.println("Element found at index " + ans);
        }
    }

    static int binSrcI(int[] arr, int key) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int binSrcD(int[] arr, int key) {
        int high = 0;
        int low = arr.length-1;
        while (low >= high) {
            int mid = high + (low - high) / 2;

            if (key > arr[mid]) {
                low = mid - 1;
            } else if (key < arr[mid]) {
                high = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
