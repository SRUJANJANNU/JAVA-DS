package ss;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("no of elements :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements:");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Key Element");
        int key = s.nextInt();
        int len = arr.length;
        System.out.println(len);
        for(int i=0;i<len;i++){
            if(arr[i]==key){
                System.out.print("element found at "+i);
            }
            else{
                System.out.print("");
            }
        }
    }
}
