package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilikLab.polyLab;

public class OracleDbConnection extends DbConnection{
	public void oppenConnection() {
		System.out.println(" Oracle bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println(" Oracle bağlantısı kapatıldı");
	}
	public void executeQuery(String  Oracle) {
		System.out.println(" Oracle komutları çalıstırıldı");
	}

}
