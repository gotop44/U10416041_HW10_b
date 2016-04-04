/** U10416041 */

import java.util.Scanner;

public class BubbleSort {
	
	/** Main method */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nHow many integers you want to Bubble Sort: ");
		int n = input.nextInt();
		
		int[] bubble =  new int[n];
		
		for (int i = 0; i < n; i++) {
			
			bubble[i] = input.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j < n - 1 - i; j++) {
				
				if (bubble[j] > bubble[j + 1]) {
					
					int temp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = temp;
				}
			}
		}
		
		System.out.print("\nBubble Sort: ");
		for (int i = 0; i < n; i++) {
			System.out.print(bubble[i] + " ");
		}
	}
}