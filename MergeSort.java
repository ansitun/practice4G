package practice4G;

import java.util.Scanner;

public class MergeSort {
	
	public static void main(String args[]) {
		
		int size;
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		
		int arr[] = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		
		MergeSort ms = new MergeSort();
		ms.mergesort(arr, 0, size);
		
		for (int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		
		in.close();
	}
	
	public void mergesort(int[] arr, int low, int high) {
		int mid = ( low + high ) >>> 1;
		
		if(low < high-1) {
			mergesort(arr, low, mid);
			
			mergesort(arr, mid, high);
			
			merge(arr, low, mid, high);
		}
		
		return;
	}
	
	public void merge(int[] arr, int low, int mid, int high) {
		
		int c, j=0, i=0, low_end = mid-low, high_end = high-mid;
		int l[] = new int[low_end];
		int h[] = new int[high_end];
		
		// splitting into 2 arrays
		for(i=low; i<mid; i++) {
			l[j++] = arr[i];
		}
		
		j=0;
		for(i=mid; i<high; i++) {
			h[j++] = arr[i];
		}
		
		i=j=0;
		c=low;
		
		while(i<low_end && j<high_end) {
			
			while(i<low_end && j<high_end && l[i] <= h[j]) {
				arr[c++] = l[i++];
			}
			
			while(i<low_end && j<high_end && h[j] <= l[i]) {
				arr[c++] = h[j++];
			}
			
		}
		
		while(i < low_end) {
			arr[c++] = l[i++];
		}
		
		while(j < high_end) {
			arr[c++] = h[j++];
		}
		
	}
}
