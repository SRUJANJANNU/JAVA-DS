package ss;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
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
        int ans = binSrc( arr, key);
        System.out.println("Element found at index "+ans);

    }

    static int binSrc(int[] arr, int key) {
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
}
