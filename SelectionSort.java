package practice4G;
import java.util.*;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int test_cases, size;
		Scanner in = new Scanner(System.in);
		test_cases = in.nextInt();
		int j,arr[][] = new int[test_cases][];
		
		SelectionSort ss =  new SelectionSort();
		
		for(int i= 0; i<test_cases; i++) {
			size = in.nextInt();
			arr[i] = new int[size];
			for(j=0; j< size; j++) {
				arr[i][j] = in.nextInt();
			}
			
			ss.sort(arr[i], size);
			for(j=0; j< size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
		
		return;
	}
	
	public void sort(int[] arr, int size) {
		
		int min;
		for(int i=0; i<size-1; i++) {
			min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				arr[i] = arr[i] + arr[min];
				arr[min] = arr[i] - arr[min];
				arr[i] = arr[i] - arr[min];
			}
		}
		
		return;
	}
}
