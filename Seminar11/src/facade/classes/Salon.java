package facade.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	private List<Pat>paturi;

	public Salon(int nrPaturi) {
		super();
		setPaturi(nrPaturi);
	}

	private void setPaturi(int nrPaturi) {
		this.paturi = new ArrayList<Pat>();
		for(int i = 0; i < nrPaturi; i++) {
			this.paturi.add(new Pat(i+1, i%2==0));
		}
	}
	
	public boolean arePaturiLibere() {
		for(Pat pat : paturi) {
			if(pat.isLiber())
				return true;
		}
		return false;
	}
	
	
	
}
