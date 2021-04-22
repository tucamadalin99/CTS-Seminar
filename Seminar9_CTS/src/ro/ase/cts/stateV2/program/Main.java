package ro.ase.cts.stateV2.program;

import ro.ase.cts.state.classes.Masa;
import ro.ase.cts.state.classes.StareLibera;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(101);
		masa.rezervaMasa();
		masa.rezervaMasa();
		//masa.setStareMasa(new StareLibera());
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
