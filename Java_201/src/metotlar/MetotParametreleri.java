package metotlar;

import java.util.Arrays;

public class MetotParametreleri {
	
	public void passByValue(int x) {
		System.out.println("PBV"+x);
		x=10;
		System.out.println("PBV"+x);
	}
	
	public void degistir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = sayilar[i]*2;
		}
	}
	
	public void test(final int x) {
		//x=10;
		System.out.println(x);
	}
	
	public void varArgs(int a,int... numbers) {
		int x = numbers[0];
		int y= numbers[1];
		System.out.println((x*a)+(y*a));
	}
	
	public static void main(String[] args) {
		MetotParametreleri metotParametreleri  = new MetotParametreleri();
		/*
		 int x=20;
		 System.out.println(x);
		 metotParametreleri.passByValue(x);
		 System.out.println(x);
		 int[] sayilar= {1,2,3,4,5};
		 System.out.println(Arrays.toString(sayilar));
		 metotParametreleri.degistir(sayilar);
		 System.out.println(Arrays.toString(sayilar));*/
		metotParametreleri.test(5);
		metotParametreleri.varArgs(10,1,2);
		
	}

}
