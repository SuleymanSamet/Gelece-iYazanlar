package nesneYönelimliProgramlama.metotEzme.metotOverridingLab;

public class Main {

	public static void main(String[] args) {
		Kisi kisi=new Kisi("1","Fatih");
		System.out.println(kisi.toString());
		Kisi kisi2=new Kisi("1","Fatih");
		System.out.println(kisi2.toString());
		System.out.println(kisi==kisi2);//false
		System.out.println(kisi.equals(kisi2));
	}

}
