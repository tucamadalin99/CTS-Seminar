package ro.ase.cts.chain;

public class ContIndisponibil extends Cont {

	public ContIndisponibil(String numeClient) {
		super(0, numeClient, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		// TODO Auto-generated method stub
		System.out.println("Fonduri insuficiente pentru a extrage suma de: " + suma);
	}
	
}
