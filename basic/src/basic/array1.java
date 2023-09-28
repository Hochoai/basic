package basic;
import java.util.Scanner;

public class array1 {
	
	public int[] input(int n) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[n];
		for(int i = 0; i < n; i++ ) {
			System.out.println();
			System.out.print("Nhập phần tử thứ "+i+": ");
			list[i] = sc.nextInt();
		}
		return list;
	}
	
	public void print(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}
	
	public int findNumberMax(int[] list) {
		int max = list[0];
		for(int i=0; i<list.length; i++) {
			if(max < list[i]) {
				max = list[i];
			}
		}
		return max;
	}
	
	public void findNumbersMax(int[] list) {
		System.out.println("Các phần tử lớn nhất nằm ở");
		for(int i=0; i<list.length; i++) {
			if(list[i] == findNumberMax(list)) {
				System.out.println("Vị trí thứ: "+ i);
			}
		}
	}
	
	public void swap(int[] list, int index1, int index2) {
	    int temp = list[index1];
	    list[index1] = list[index2];
	    list[index2] = temp;
	}
	//Selection sort
//	public void arrangeArray(int[] list) {
//		for(int i=0; i<list.length-1; i++) {
//			for(int j=i+1; j<list.length; j++) {
//				if(list[i] > list[j]) {
//					swap(list, i, j);
//				}
//			}
//		}
//	}
	//Buble sort
//	public void arrangeArray(int[] list) {
//		for(int i=0; i<list.length-1; i++) {
//			for(int j=i; j<list.length-i-1; j++) {
//				if(list[j] > list[j+1]) {
//					swap(list, j, j+1);
//				}
//			}
//		}
//	}
	//Quick sort
	public int partition(int list[], int begin, int end) {
		int pivot = list[end];
	    int i = begin - 1;

	    for (int j = begin; j < end; j++) {
	        if (list[j] <= pivot) {
	            i++;
	            swap(list, i, j);
	        }
	    }
	    swap(list, i + 1, end);
	    return i + 1;
	} 
	public void arrangeArray(int[] list, int begin, int end) {
		if(begin < end) {
			int partition = partition(list, begin, end);
			arrangeArray(list, begin, partition-1);
			arrangeArray(list, partition+1, end);
		}
	}
}
