
public class Main {

	public static void main(String[] args) {
		// TekilSinif = t = new TekilSinif(); //erişim yok
		TekilSinif t = TekilSinif.Instance();
		System.out.println(t.degerAl());
		t.degerYaz(20);
		System.out.println(t.degerAl());
		TekilSinif u = TekilSinif.Instance();
		System.out.println(u.degerAl());

	}

}
