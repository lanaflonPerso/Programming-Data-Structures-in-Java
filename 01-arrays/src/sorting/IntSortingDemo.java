package sorting;

import java.util.Arrays;

public class IntSortingDemo {
	
	public static int findMinIndex(int[] a, int startIndex) {
		int min = a[startIndex];
		int minIndex = startIndex;
		for(int i = startIndex + 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void sortSelectMin(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			int minIndex = findMinIndex(a, i);
			swap(a, i, minIndex);
			System.out.println("Debug[" + i + "]: " + Arrays.toString(a));
		}
	}
	
	public static void sortBubble(int[] a) {

	}
	
	public static void sortInsertion(int[] a) { // (n-1) * n/2 => Complexity = O(n^2)
		for(int i = 2; i < a.length; i++) { // n-1 iterations
			for(int j = 0; j < i; j ++) { // average loop j + loop k =  n/2 operations
				if(a[i] < a[j]) {
					int temp = a[i];
					for(int k = i; k > j; k--) { 
					}
					a[j] = temp;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Initialize array using array literal
		int[] a = {23, 15, 17, 92, 110, 4, 12, 67, 54, 45};
		
//		int minIndex = findMinIndex(a, 0);
//		System.out.println("a[" + minIndex + "]= " + a[minIndex]);
		
		sortInsertion(a);
		System.out.println(Arrays.toString(a));

	}

}
