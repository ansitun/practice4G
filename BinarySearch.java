package practice4G;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		int test_cases,size, key;
		
		Scanner in = new Scanner(System.in);
		test_cases = in.nextInt();
		
		int arr[][] = new int[test_cases][];
		
		for(int i=0; i<test_cases; i++) {
			size = in.nextInt();
			arr[i] = new int[size];
			
			for(int j=0; j<size; j++) {
				arr[i][j] = in.nextInt();
			}
			
			key = in.nextInt();
			System.out.println("Result is: " + binarySearch(arr[i], key, 0, size));
		}
		
		in.close();
	}
	
	public static int binarySearch(int[] arr, int key, int left, int right) {
		
		if(left == right) {
			return -1;
		}
		
		int result, mid = ( left + right ) / 2;
		
		if(key == arr[mid]) {
			result = mid;
		} else if(key > arr[mid]){
			result = binarySearch(arr, key, mid + 1, right);
		} else {
			result = binarySearch(arr, key, left, mid - 1);
		}
		
		return result;
	}
}
