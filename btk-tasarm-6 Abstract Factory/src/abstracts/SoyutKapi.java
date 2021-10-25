package abstracts;

public abstract class SoyutKapi {
	private boolean durum;
	
	public boolean isDurum() {
		return durum;
	}
	public void setDurum(boolean durum) {
		this.durum = durum;
	}
	
	public abstract boolean kapiAc();
	public abstract void kapiKapat();
}
