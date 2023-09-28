package main;
import java.util.Scanner;
import basic.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n;
//		
//		do {
//			System.out.print("\nNhập số lượng phần tử: ");
//			n = sc.nextInt();
//			if(n<=0) {
//				System.out.println("Không hợp lệ!!!");
//			}
//		}while(n <= 0);
//		array1 a1 = new array1();
//		int []list = a1.input(n);
//		System.out.print("\nMảng vừa nhập là: ");
//		a1.print(list);
//		System.out.println();
//		System.out.println("Phần tử lớn nhất của mảng là: "+a1.findNumberMax(list));
//		a1.findNumbersMax(list);
//		a1.arrangeArray(list, 0, list.length-1);
//		System.out.print("Mảng sắp xếp: ");
//		a1.print(list);
		
		PTB2 ptb2 = new PTB2();
		ptb2.print();
		ptb2.solve();
	}

}
