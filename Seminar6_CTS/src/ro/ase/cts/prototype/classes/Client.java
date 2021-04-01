package ro.ase.cts.prototype.classes;

public class Client implements AbstractPrototype {
	private int cod;
	private String nume;
	private int varsta;
	
	//validare varsta
	public Client(int cod, String nume, int varsta) {
		super();
		this.cod = cod;
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client() {
		
	}

	@Override
	public String toString() {
		return "Client [cod=" + cod + ", nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public AbstractPrototype copy() {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.cod = this.cod;
		client.nume = this.nume;
		client.varsta = this.varsta;
		return client;
	}
	
	
	
	
}
