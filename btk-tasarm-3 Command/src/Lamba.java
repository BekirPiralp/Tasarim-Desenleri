
public class Lamba {
	private int lamba;
	//kurucu method
	public Lamba() {
		lamba = 0; // Başalangıç değeri yüklendi
	}
	public void ac() {
		System.out.println("Lamba açıldı");
		lamba = 1;
	}
	public void kapa() {
		System.out.println("Lamba kapandı");
		lamba = 0;
	}
	public int degeri() {
		return lamba;
	}
}
