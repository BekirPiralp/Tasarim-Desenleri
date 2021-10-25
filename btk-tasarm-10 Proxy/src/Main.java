import abstracts.Grafik;

public class Main {
	
	public static void bilgiler(Grafik grafik) {
		grafik.grafikBilgisi();
	}
	
	public static void ekranaCiz(Grafik grafik) {
		grafik.Ciz();
	}

	public static void main(String[] args) {
		GoruntuVekili goruntuVekili = new GoruntuVekili("resim.jpg");
		bilgiler(goruntuVekili);
		ekranaCiz(goruntuVekili);
		
		GoruntuVekili goruntu = new GoruntuVekili("foto.jpg");
		bilgiler(goruntu);
		ekranaCiz(goruntu);
		ekranaCiz(goruntuVekili);
	}

}
