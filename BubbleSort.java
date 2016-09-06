package practice4G;
import java.util.*;

public class BubbleSort {
	
	public static void main (String args[]) {
		
		int size;
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i< size; i++) {
			arr[i] = in.nextInt();
		}
		BubbleSort bs = new BubbleSort();
		bs.sort(arr, size);
		
		for(int i=0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
		in.close();
		
		return;
	}
	
	public void sort(int arr[], int size) {
		
		int flag = 0;
		for(int i=0; i< size-1; i++) {
			for(int j=0; j< size-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		
		return;
	}
}
