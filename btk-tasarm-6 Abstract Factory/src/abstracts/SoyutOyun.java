package abstracts;
import java.util.ArrayList;

public abstract class SoyutOyun {
	private ArrayList<SoyutOda> odalar;
	public ArrayList<SoyutOda> getOdalar() {
		return odalar;
	}
	public void setOdalar(ArrayList<SoyutOda> odalar) {
		this.odalar = odalar;
	}
	public abstract void odaEkle (SoyutOda oda);
	public abstract void oyunCalistir();
}
