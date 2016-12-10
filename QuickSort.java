package practice4G;

import java.util.Scanner;

public class QuickSort {

	public static void main(String args[]) {
		int i,size;
		
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		
		int arr[] = new int[size];
		for(i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		
		in.close();
		
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, size-1);
		
		for(i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void sort(int arr[], int low, int high) {
		
		if(low < high) {
			int p = partision(arr, low, high);
			
			sort(arr, low, p - 1);
			sort(arr, p + 1, high);
		}
		
	}
	
	public int partision(int[] arr, int low, int high) {
		
		int c,i,temp,pivot = high;
		c = low;
		
		for(i=low; i<high-1; i++) {
			if(arr[i] <= arr[pivot]) {
				temp = arr[c];
				arr[c] = arr[i];
				arr[i] = temp;
				c++;
			}
		}
		
		temp = arr[c];
		arr[c] = arr[pivot];
		arr[pivot] = temp;
		
		return c;
		
	}
}
