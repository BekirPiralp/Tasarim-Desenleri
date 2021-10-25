public class Tanimsiz implements State{
	private Program program;
	
	public Tanimsiz(Program program) {
		this.program = program;
	}
	@Override
	public void Handle() {
		System.out.println("1) Kayıt Olun");
		System.out.println("2) Kullanıcı Giriş");
		System.out.println("3) Yönetici Giriş");
		
		program.GirisYap();
		program.Yonetici();
	}
	

}
