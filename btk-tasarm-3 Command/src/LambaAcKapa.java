
public class LambaAcKapa implements Command {
	
	Lamba lamba;
	
	public LambaAcKapa(Lamba lamba) {
		this.lamba = lamba;
	}

	@Override
	public void Execute() {
		if(lamba.degeri() == 1) {
			lamba.kapa();
		}	
		else {
			lamba.ac();
		}
	}
	
	@Override
	public String toString() {
		return lamba.degeri()==1?"Lambayı kapat":"Lambayı aç";
	}

}
