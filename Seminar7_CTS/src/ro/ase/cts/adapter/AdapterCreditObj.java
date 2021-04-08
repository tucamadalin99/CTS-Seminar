package ro.ase.cts.adapter;

public class AdapterCreditObj implements InterfataCredit {
	private Leasing leasing;

	public AdapterCreditObj(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		this.leasing.oferaLeasing(numeClient, suma);	
	}
	
	
	
}
