package facade.classes;

public class Medic {
	private String nume;
	private String specializare;
	
	
	
	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}



	public boolean esteNecesaraInternare(Pacient pacient) {
		return pacient.isEsteInStareGrava();
	}
}
