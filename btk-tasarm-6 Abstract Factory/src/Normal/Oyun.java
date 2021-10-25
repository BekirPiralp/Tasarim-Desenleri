package Normal;
import java.util.ArrayList;
import abstracts.SoyutOda;
import abstracts.SoyutOyun;

public class Oyun extends SoyutOyun{
	
	public Oyun () {
		this.setOdalar(new ArrayList<SoyutOda>()); // liste nesnesi oluşturduk
	}

	@Override
	public void odaEkle(SoyutOda oda) {
		this.getOdalar().add(oda); // almış olduğumuz oyunu listeye ekledik	
	}

	@Override
	public void oyunCalistir() {
		System.out.println("Normal oyun modu çalışıyor");
		System.out.println("Oda sayısı: "+ this.getOdalar().size()); // sistemde açılmış odalar
	}

}
