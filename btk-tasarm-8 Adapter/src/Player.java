import java.util.ArrayList;
public class Player {
	private ArrayList<Muzik> liste;
	public Player() {
		liste = new ArrayList<Muzik>();
	}
	public void listeyeEkle(Muzik muzik) {
		liste.add(muzik);
	}
	public void Play( ) {
		for(Muzik muzik : liste) {
			muzik.MP3Oynat();
		}
	}
}
