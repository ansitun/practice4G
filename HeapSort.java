package practice4G;

import java.util.Scanner;


public class HeapSort {

	public static void main(String args[]) {
		int size,i;
		
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		
		int arr[] = new int[size];
		
		for(i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		
		HeapSort hs = new HeapSort();
		hs.sort(arr, size);
		
		for(i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		
		in.close();
	}
	
	public void sort(int[] arr, int n) {
		
		int i,temp;
		for(i= n/2 - 1; i>=0; i--) {
			heapify(arr, n, i);
		}
		
		for(i=n-1; i>=0; i--) {
			
			//put the max element at the end of the array and reduce the size of array by 1 for heapyfing
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			heapify(arr, i, 0); // heapify the new tree where the root is changed
		}
		
	}
	
	public void heapify(int[] arr, int size, int index) {
		
		int temp,l = (2*index) +1, r = (2*index) +2, largest = index;
			
		if(l<size && arr[l] > arr[largest]) {
			largest = l;
		}
			
		if(r<size && arr[r] > arr[largest]) {
			largest = r;
		}
		
		if(largest != index) {
			temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
					
			heapify(arr, size, largest);
		}
		
	}
}
