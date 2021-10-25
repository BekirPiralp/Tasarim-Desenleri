
public class Sahin extends Araba {
	
	public Sahin() {
		this.maksHiz = 180;
		this.anlikHiz = 0;
	}

	@Override
	public int maksHizAl() {
		return this.maksHiz;
	}

	@Override
	public String marka() {
		return "Şahin";
	}

	@Override
	public void hiziBelirle(int s) {
		this.anlikHiz = s;
	}
		
}
