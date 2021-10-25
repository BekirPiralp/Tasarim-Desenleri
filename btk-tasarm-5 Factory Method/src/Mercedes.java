
public class Mercedes extends Araba {

	public Mercedes() {
		this.maksHiz = 240;
		this.anlikHiz = 0;
	}
	@Override
	public int maksHizAl() {
		return this.maksHiz;
	}

	@Override
	public String marka() {
		return "Mercedes";
	}

	@Override
	public void hiziBelirle(int s) {
		this.anlikHiz = s;
	}

}
