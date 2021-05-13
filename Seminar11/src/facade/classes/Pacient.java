package facade.classes;

public class Pacient {
	private String nume;
	private boolean esteInStareGrava;
	
	public Pacient(String nume, boolean esteInStareGrava) {
		super();
		this.nume = nume;
		this.esteInStareGrava = esteInStareGrava;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", esteInStareGrava=" + esteInStareGrava + "]";
	}

	public String getNume() {
		return nume;
	}

	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}
	
	
	
}
