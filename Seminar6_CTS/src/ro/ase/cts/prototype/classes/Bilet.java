package ro.ase.cts.prototype.classes;

public class Bilet implements AbstractPrototype {
	private int cod;
	private String echipaA;
	private String echipaB;
	private String data;
	
	
	public Bilet(int cod, String echipaA, String echipaB, String data) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.data = data;
	}
	
	public Bilet() {
		
	}

	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", data=" + data + "]";
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public AbstractPrototype copy() {
		// TODO Auto-generated method stub
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.data = this.data;
		bilet.echipaA = this.echipaA;
		bilet.echipaB = this.echipaB;
		
		return bilet;
	}
	
	
	
}
