package ro.ase.cts.composite.clase;

public interface IOptiuneMeniu {
	void adaugaNod(IOptiuneMeniu optiune) throws Exception;
	void stergeNod(IOptiuneMeniu optiune);
	IOptiuneMeniu getNod(int index);
	void descriere();
}
