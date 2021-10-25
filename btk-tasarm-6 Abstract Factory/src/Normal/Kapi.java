package Normal;
import abstracts.SoyutKapi;

public class Kapi extends SoyutKapi {

	public Kapi() {
		this.setDurum(false);
	}
	@Override
	public boolean kapiAc() {
		this.setDurum(true);
		return this.isDurum();
	}

	@Override
	public void kapiKapat() {
		this.setDurum(false);
	}
}



