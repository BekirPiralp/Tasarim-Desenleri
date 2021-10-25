package abstracts;

public abstract class Grafik {
	//protected String dosyaYolu;
	private String dosyaYolu;
	public String getDosyaYolu() {
		return dosyaYolu;
	}
	public void setDosyaYolu(String dosyaYolu) {
		this.dosyaYolu = dosyaYolu;
	}
	public abstract void Ciz();
	public abstract void grafikBilgisi();
}
