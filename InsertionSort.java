package practice4G;

import java.util.*;

public class InsertionSort {
	public static void main(String args[]) {
		
		int size;
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i< size; i++) {
			arr[i] = in.nextInt();
		}
		
		InsertionSort is = new InsertionSort();
		is.sort(arr, size);
		
		for(int i=0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
		in.close();
		
		return;
	}
	
	public void sort(int[] arr, int size) {
		
		int key, j;
		for(int i=1; i< size; i++) {
			key = arr[i];
			j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		return;
	}
}
