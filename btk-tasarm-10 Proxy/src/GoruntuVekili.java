import abstracts.Grafik;

public class GoruntuVekili extends Grafik {
	
	private Goruntu goruntu;
	
	public GoruntuVekili(String dosyaYolu) {
		this.setDosyaYolu(dosyaYolu);
		goruntu = new Goruntu(dosyaYolu);
	}

	@Override
	public void Ciz() {
		goruntu.Ciz();
	}

	@Override
	public void grafikBilgisi() {
		System.out.println("Dosya adı: "+this.getDosyaYolu());	
		
	}

}
