package metotlar;

import java.util.Arrays;
import java.util.Scanner;

public class MetotLab123 {
	private static int x = 20;

	public void normalMetot() {
		System.out.println("Normal metot:" + x);

	}

	public static void statikMetot() {
		System.out.println("Static metot : " + x);
	}

	public static int max(int a, int y, int z) {
		int max = a;
		if (y > max) {
			System.out.println("2.sayı en büyük");
			max = y;
		} else if (z > max) {
			System.out.println("3.sayı en büyük");
			max = z;
		} else {
			System.out.println("1. sayı en büyük");
		}
		return max;

	}

	public static double max(double a, double y, double z) {
		double max = a;
		if (y > max) {
			max = y;
			System.out.println("En büyük sayı 2.");
		} else if (z > max) {
			max = z;
			System.out.println("En büyük sayı 3.");
		} else {
			System.out.println("En büyük sayı 1.");
		}
		return max;
	}

	public static boolean eq(int[] x, int[] y) {// x ve y dizi boyutunu ve dizelerini karşılaştır
		boolean result = true;
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] != y[i]) {
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	public static int cube(int x) {
		return x * x * x;
	}

	public static int toplam(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
		}

		return result;
	}

	public static int[] ciftSayilar(int[] sayilar) {
		int adet = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				adet++;
			}
		}
		int[] sonuc = new int[adet];
		int index = 0; 
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				sonuc[index] = sayilar[i];
				index++; 
			}
		}
		return sonuc;
	}
	
	public static void degistir(int[] sayilar) {
		int temp= sayilar[0];
		sayilar[0]=sayilar[1];
		sayilar[1]=temp;
	}
	

	public static void main(String[] args) {
		/*
		 * MetotLab1 metotLab1=new MetotLab1(); metotLab1.normalMetot(); statikMetot();
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.print("1. sayı :"); int a=scanner.nextInt();
		 * System.out.print("2. sayı:"); int y=scanner.nextInt();
		 * System.out.print("3. sayı :"); int z =scanner.nextInt(); /*
		 * System.out.print("1. sayı :"); double a=scanner.nextDouble();
		 * System.out.print("2. sayı:"); double y=scanner.nextDouble();
		 * System.out.print("3. sayı :"); double z=scanner.nextDouble();
		 */
		// max(a, y, z);

		/*
		 * int[] x= {1,2,3}; int[] y= {1,2,3}; System.out.println(eq(x, y));
		 */
		/*
		 * System.out.print("küpü bulunacak sayı :"); int x=scanner.nextInt();
		 * System.out.println(cube(x));
		 * 
		 * int[] numbers={1,6,3,4,5}; System.out.println(toplam(numbers));
		 */
		int[] sonucCiftSayilar = MetotLab123.ciftSayilar(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(Arrays.toString(sonucCiftSayilar));
		

		int[] sayilar= {2,3};
		System.out.println(Arrays.toString(sayilar));
		degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));
	}

}
