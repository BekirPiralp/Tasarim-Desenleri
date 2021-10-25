package Buyulu;
import abstracts.SoyutKapi;
import java.util.Scanner;

public class Kapi extends SoyutKapi {

	private String sihirli,veri;
	private Scanner scanner;
	
	public Kapi() {
		sihirli = "Açıl Susam Açıl!";
		this.setDurum(false);
	}
	@Override
	public boolean kapiAc() {
		if(this.isDurum())
			return this.isDurum();
		
		System.out.println("Kapiyi açmak için sihirli cümleyi söyle");
		scanner = new Scanner(System.in);
		veri = scanner.nextLine();
		scanner.close();
		
		this.setDurum(veri.equalsIgnoreCase(sihirli)?true:false);
		return this.isDurum();
	}

	@Override
	public void kapiKapat() {
		this.setDurum(false);
	}

}
