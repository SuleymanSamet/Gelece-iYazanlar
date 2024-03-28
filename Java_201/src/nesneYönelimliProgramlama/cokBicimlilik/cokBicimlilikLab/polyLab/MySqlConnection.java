package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilikLab.polyLab;

public class MySqlConnection extends DbConnection{
	public void oppenConnection() {
		System.out.println("MySql bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println("MySql bağlantısı kapatıldı");
	}
	public void executeQuery(String Mysql) {
		System.out.println("My sql komutları çalıstırıldı");
	}

}
