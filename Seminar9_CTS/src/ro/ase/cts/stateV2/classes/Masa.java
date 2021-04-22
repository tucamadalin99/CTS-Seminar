package ro.ase.cts.stateV2.classes;

public class Masa {
	private int nrMasa;
	StareMasa stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}
	
	public void elibereazaMasa() {
		if(!(stare instanceof StareLibera)) {
			System.out.println("Masa " + this.nrMasa + " a fost eliberata");
			stare = new StareLibera();
		}else {
			System.out.println("Masa este deja libera");
		}
	}
	
	public void rezervaMasa() {
		if(stare instanceof StareLibera) {
			System.out.println("Masa " + this.nrMasa + " a fost rezervata");
			stare = new StareRezervata();
		}else {
			System.out.println("Masa este deja ocupata.");
		}
	}
	
	public void ocupaMasa() {
		if(!(stare instanceof StareRezervata)) {
			System.out.println("Masa " + this.nrMasa + " a fost ocupata");
			stare = new StareOcupata();
		}else {
			System.out.println("Masa este deja rezervata.");
		}
	}
}
