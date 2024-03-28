package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilikLab.polyLab;

public class MsSqlConnection extends DbConnection{
	public void oppenConnection() {
		System.out.println("MsSql bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println("MsSql bağlantısı kapatıldı");
	}
	public void executeQuery(String MsSql) {
		System.out.println("MsSql komutları çalıstırıldı");
	}

}
