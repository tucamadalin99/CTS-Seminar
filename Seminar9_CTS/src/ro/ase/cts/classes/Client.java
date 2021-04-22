package ro.ase.cts.classes;

public class Client {
	private ModPlata modPlata;
	private String numeClient;
	
	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata = new Cash();
	}
	
	
	public void platesteNota(float suma) {
		System.out.println(this.numeClient + " trebuie sa plateasca");
		modPlata.realizeazaPlata(suma);
	}


	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	
	
}
