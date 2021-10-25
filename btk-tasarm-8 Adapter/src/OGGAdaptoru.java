public class OGGAdaptoru  extends Muzik{
	private OGG ogg;
	public OGGAdaptoru(String isim) {
		super(isim);
		ogg = new OGG(isim);
	}
	
	@Override
	public void MP3Oynat() {
		ogg.OGGOynat(1);
	}

}
