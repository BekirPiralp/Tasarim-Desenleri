
public class Televizyon {
	private int kanal;
	public Televizyon() {
		kanal = 1;//ilk deger yüklendi
	}
	
	public void kanalDegistir(int k) {
		kanal = k;//girilen değer kanal olarak ayarlandı
	}
	public void birSonrakiKanal() {
		kanal++;//kanal değeri 1 arttı
	}
	public void birOncekiKanal() {
		kanal--;//kanal degeri 1 eksildi
	}
	
	public int gecerliKanal() {
		return kanal;//şuanki kanal değeri alındı
	}

}
