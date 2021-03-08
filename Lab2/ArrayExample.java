package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	        System.out.print("nhap so phan tu cua mang");
	        int n = input.nextInt();
	        int[] arr = new int[n];
	        System.out.print("nhap cac phan tu cua mang");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] =" , i);
	            arr[i] = input.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.print("cac phan tu cua mang");
	        show(arr);
	    }
	
	    public static void show(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        System.out.println("sum = " + sum(arr));
	        System.out.println("average = " + average(arr));
	    }
	    public static int sum(int[] arr){
	    	int s = 0;
	        for (int i = 0; i < arr.length; i++) {
	            s += arr[i];
	        }
	        return s;
	    }
	    public static double average(int[] arr){
	       return sum(arr)/arr.length;
	    }
}
