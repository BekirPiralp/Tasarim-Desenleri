package Buyulu;
import java.util.ArrayList;

import abstracts.SoyutOda;
import abstracts.SoyutOyun;

public class Oyun extends SoyutOyun{
	
	public Oyun() {
		this.setOdalar(new ArrayList<SoyutOda>()); //Listeyi oluşturduk
	}
	@Override
	public void odaEkle(SoyutOda oda) {
		this.getOdalar().add(oda);//oda ekledik
	}

	@Override
	public void oyunCalistir() {
		System.out.println("Büyülü oyun modu çalışıyor...");
		if(this.getOdalar().size() > 0) {
			if(this.getOdalar().get(0).kapiAc()) {
				System.out.println("Kapi açıldı!");
				}else {
						System.out.println("Kapi kapandı!");
						}
		}else {
			System.out.println("Lütfen birtane büyülü oda açınız");
		}
	}

}
