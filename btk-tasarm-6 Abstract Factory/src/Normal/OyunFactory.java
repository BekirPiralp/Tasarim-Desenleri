package Normal;
import abstracts.SoyutKapi;
import abstracts.SoyutOda;
import abstracts.SoyutOyun;

public class OyunFactory extends abstracts.OyunFactory {

	@Override
	public SoyutOyun yeniOyun() {
		return new Oyun();
	}

	@Override
	public SoyutKapi kapiYarat() {
		return new Kapi();
	}

	@Override
	public SoyutOda odaYarat() {
		return new Oda();
	}

}
