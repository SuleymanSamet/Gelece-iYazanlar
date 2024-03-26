package metotlar;

import java.util.Scanner;

public class StaticMetotlar {
	
	public static double topla(double x,double y) {
		return x+y;
	}
	public static double çıkar(double x,double y) {
		return x-y;
	}
	public static double çarp(double x,double y) {
		return x*y;
	}
	public static double böl(double x,double y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1. SAYI: ");
		int x=scanner.nextInt();
		System.out.print("2. SAYI: ");
		int y=scanner.nextInt();
		System.out.println(topla(x, y));
		
		
	}

}
