package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuneMeniu {
	List<IOptiuneMeniu> optiuni;
	private String numeSectiune;
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.optiuni = new ArrayList<>();
	}


	@Override
	public void adaugaNod(IOptiuneMeniu optiune) {
		// TODO Auto-generated method stub
		optiuni.add(optiune);
		
	}


	@Override
	public void stergeNod(IOptiuneMeniu optiune) {
		// TODO Auto-generated method stub
		optiuni.remove(optiune);
	}


	@Override
	public IOptiuneMeniu getNod(int index) {
		// TODO Auto-generated method stub
		return optiuni.get(index);
	}


	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea: " + numeSectiune);
		for(IOptiuneMeniu op : optiuni) {
			op.descriere();
		}
	}
	
	
	
	
}
