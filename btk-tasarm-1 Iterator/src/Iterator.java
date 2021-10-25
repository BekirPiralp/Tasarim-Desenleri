public abstract class Iterator {
	public abstract void Frist();		/*imleci ilk elemana getir*/
	public abstract void Next();		/*imleci birsonraki elemana geçir*/
	public abstract boolean IsDone();		/*koleksiyonun sonuna geldik*/
	public abstract int CurrentItem();	/*imlecin şuanki konumu*/
}
