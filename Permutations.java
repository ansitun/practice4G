package practice4G;

import java.util.Scanner;

/**
 * @author ansurajk
 *
 */
public class Permutations {
	
	public static void main(String args[]) {
		
		System.out.println("initiate bot");
		
		int n, arr[], i=0;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		arr = new int[10]; //max length of the number is 10
		
		while(n > 0) {
			arr[i++] = n%10;
			n = n/10;
		}
		
		permute(arr, 0, i);
		
		
		System.out.println("end bot");
		
		
	}
	
	public static void permute(int[] n, int index, int arrLen) {
		int i, j;
		
		if(index == arrLen -1) {
			for(i = 0; i < arrLen; i++) {
				System.out.print(n[i]);
			}
			
			System.out.println();
			return;
		}
		
		for(j = index; j< arrLen; j++) {
			
			swap(n, j, index);
			
			permute(n, index+1, arrLen);
			
			swap(n, j, index);		//backtrack
			
		}
		
		return;
		
	}
	
	public static void swap(int[] n,int j,int index) {
		int c;
		c = n[j];			
		n[j] = n[index];
		n[index] = c;
	}
	

}
