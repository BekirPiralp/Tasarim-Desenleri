package abstracts;

public abstract class SoyutOda {
	private SoyutKapi kapi;
	public SoyutKapi getKapi() {
		return kapi;
	}
	public void setKapi(SoyutKapi kapi) {
		this.kapi = kapi;
	}
	public abstract void kapiEkle(SoyutKapi kapi);
	public abstract boolean kapiAc();
}
