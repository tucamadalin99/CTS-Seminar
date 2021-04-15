package ro.ase.cts.composite.clase;

public class Item implements IOptiuneMeniu {
	
	
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	String numeItem;

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Ex");
	}

	@Override
	public void stergeNod(IOptiuneMeniu optiune) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Ex");
	}

	@Override
	public IOptiuneMeniu getNod(int index) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Ex");
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Item: " + numeItem);
	}
}
