package basic;

import java.util.Scanner;

public class PTB2 {
	private double a, b, c;
	
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ta có hệ phương trình: ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		a = sc.nextDouble();
		System.out.print("Nhập b: ");
		b = sc.nextDouble();
		System.out.print("Nhập c: ");
		c = sc.nextDouble();
		System.out.println();
		sc.close();
	}
	
	public void solve() {
		double delta = Math.pow(b,2) - 4*a*c;
		System.out.println("Delta = "+delta);
		if(delta < 0) {
			System.out.println("Phương trình vô nghiệm!!!");
		}
		else if(delta == 0) {
			System.out.println("Phương trình có nghiệm kép!!!");
			double result = -b/(2*a);
			System.out.println("x1 = x2 = "+result);
		}
		else {
			System.out.println("Phương trình có 2 nghiệm phân biệt!!!");
			double result1 = (-b+Math.sqrt(delta))/(2*a);
			double result2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("x1 = "+result1);
			System.out.println("x2 = "+result2);
		}
	}
}
