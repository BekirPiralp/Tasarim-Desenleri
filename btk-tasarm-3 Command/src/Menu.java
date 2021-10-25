import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
	private ArrayList<Command> komutlar;
	public Menu() {
		komutlar = new  ArrayList<Command>();
	}
	
	public void komutEkle(Command c) {
		this.komutlar.add(c);
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		while (s != -1) {
			for (int i=0; i<this.komutlar.size();i++) {
				System.out.println(i+": " + this.komutlar.get(i));
			}
			System.out.println("Çıkmak için -1");
			try {
				s = sc.nextInt();
				this.komutlar.get(s).Execute();
			}catch(Exception e) {
				
			}
		}
		sc.close();
	}
}
