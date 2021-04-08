package ro.ase.cts.adapterClasses;

public class AdapterCreditClasa extends Leasing implements InterfataCredit {
	
	

	public AdapterCreditClasa() {
		super();
	}
	
	

	@Override
	public void acordaCredit(String numeClient, float suma) {
		// TODO Auto-generated method stub
		super.oferaLeasing(numeClient, suma);
	}

}
