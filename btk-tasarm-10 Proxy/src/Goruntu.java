import abstracts.Grafik;

public class Goruntu extends Grafik {
	
	private byte veri[];
	
	public Goruntu(String dosyaYolu) {
		this.setDosyaYolu(dosyaYolu);
		veri = null;
	}

	@Override
	public void Ciz() {
		if(veri == null) {
			System.out.println("Dosya yükleniyor: "+ this.getDosyaYolu());
			veri = new byte [1000000];
			System.out.println("Dosya çiziliyor... ( "+this.getDosyaYolu()+" )");	
		} else {
			System.out.println("Dosya çiziliyor... ( "+this.getDosyaYolu()+" )");
		}

	}

	@Override
	public void grafikBilgisi() {

	}

}
