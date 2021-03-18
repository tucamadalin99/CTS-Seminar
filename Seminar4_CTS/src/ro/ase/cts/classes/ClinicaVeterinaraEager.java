package ro.ase.cts.classes;

public class ClinicaVeterinaraEager {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	// Instanta initializata la momentul declararii la EagerInitialization
	private static final ClinicaVeterinaraEager clinica = new ClinicaVeterinaraEager("Clinica", "Str. Dorobanti", 30, 300.5f);

	// Constructorul trebuie sa fie private obligatoriu
	private ClinicaVeterinaraEager(String nume, String adresa, int nrMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}

	// Returneaza instanta privata a clasei
	public static synchronized ClinicaVeterinaraEager getInstance() {
		return clinica;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", nrMedici=" + nrMedici + ", buget=" + buget
				+ "]";
	}

}
