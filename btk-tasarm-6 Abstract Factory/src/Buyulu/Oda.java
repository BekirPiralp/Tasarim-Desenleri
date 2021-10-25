package Buyulu;
import abstracts.SoyutKapi;
import abstracts.SoyutOda;

public class Oda extends SoyutOda {

	@Override
	public void kapiEkle(SoyutKapi kapi) {
		this.setKapi(kapi);
	}

	@Override
	public boolean kapiAc() {
		return this.getKapi().kapiAc();
	}

}
