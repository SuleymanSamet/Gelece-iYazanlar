package metotlar.yapıcıMetotlar;

public class YapıcıMetotlar {
	int x;
	public YapıcıMetotlar() {
		System.out.println("ctor");
		x=20;
	}

	public static void main(String[] args) {
		YapıcıMetotlar yapıcıMetotlar = new YapıcıMetotlar();
		System.out.println(yapıcıMetotlar.x);
		
		Ogrenci ogrenci=new Ogrenci("Goktug","Çalışkan",12);
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);
		
		Ogrenci ogrenci2=new Ogrenci();
		System.out.println(ogrenci2.ad);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.yas);
	}

}
