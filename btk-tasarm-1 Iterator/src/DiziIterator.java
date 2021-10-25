public class DiziIterator extends Iterator {
	private Dizi dizi;
	private int index;
	public DiziIterator(Dizi d) {
		dizi = d;
		index = 0;
	}
	@Override
	public void Frist() {
		index = 0;
	}

	@Override
	public void Next() {
		index++;
	}

	@Override
	public boolean IsDone() {
		return index == dizi.liste.size();
	}

	@Override
	public int CurrentItem() {
		return dizi.liste.get(index);
	}

}
