package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilikLab.polyLab;

public class DbConnection {
	public void oppenConnection() {
		System.out.println("Veri tabanı bağlantısı açıldı");
	}
	public void closeConnection() {
		System.out.println("Veri tabanı bağlantısı kapatıldı");
	}
	public void executeQuery(String sql) {
		System.out.println("SQL komutları çalıştırıldı");
	}

}
