package practice4G;

import java.util.*;

public class MinUnsortedSubArray {
	
	public static void main(String args[]) {
		
		int size,i,min, max, new_max, new_min;
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		int arr[] = new int[size];
		
		for(i=0; i<size; i++) {
			arr[i] = in.nextInt();
		}
		
		min = max = i = 0;
		
		while(arr[i+1] > arr[i]) {
			i++;
		}
		max = i-1;
		
		i = size -1;
		while(arr[i] > arr[i-1]) {
			i--;
		}
		min = i+1;
		
		new_max = max;
		new_min = min;
		for(i = max; i <= min; i++) {
			if(arr[i] > arr[new_max]) {
				new_max = i;
			}
			
			if(arr[i] < arr[new_min]) {
				new_min = i;
			}
		}
		
		if(min != new_min) {
			i = max;
			while(i>=0 && arr[i] > arr[new_min]) {
				i--;
			}
			new_min = i;
		}
		
		if(max != new_max) {
			i = min;
			while(i<size && arr[i] < arr[new_max]) {
				i++;
			}
			new_max = i;
		}
	
		System.out.println("Min index is:" + (new_min+1) + "\nMax index is:" + (new_max-1));
		
		in.close();
	}
	
}
