import abstracts.*;
public class Main {

	public static SoyutOyun oyunYarat(OyunFactory factory) {
		SoyutOyun oyun = factory.yeniOyun();
		SoyutOda oda1 = factory.odaYarat();
		SoyutOda oda2 = factory.odaYarat();
		SoyutKapi kapi1 = factory.kapiYarat();
		SoyutKapi kapi2 = factory.kapiYarat();
		
		oda1.kapiEkle(kapi2);
		oda2.kapiEkle(kapi1);
		
		oyun.odaEkle(oda1);
		oyun.odaEkle(oda2);
		
		return oyun;
	}
	public static void main(String[] args) {
		SoyutOyun normalOyun = oyunYarat(new Normal.OyunFactory());
		normalOyun.oyunCalistir();
		
		SoyutOyun buyuluOyun = oyunYarat(new Buyulu.OyunFactory());
		buyuluOyun.oyunCalistir();
		/*Sihirli cümle:
		 *  Açıl Susam Açıl!
		 *  */
	}

}
