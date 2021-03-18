package ro.ase.cts.classes;

public class ClinicaVeterinaraLazy {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	
	
	private static ClinicaVeterinaraLazy instanta = null;


	public ClinicaVeterinaraLazy(String nume, String adresa, int nrMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}
	
	
	
	public void setNume(String nume) {
		this.nume = nume;
	}



	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}



	public void setNrMedici(int nrMedici) {
		this.nrMedici = nrMedici;
	}



	public void setBuget(float buget) {
		this.buget = buget;
	}



	public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int nrMedici, float buget) {
		if(instanta == null) {
			instanta = new ClinicaVeterinaraLazy(nume,adresa,nrMedici,buget);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinaraLazy [nume=" + nume + ", adresa=" + adresa + ", nrMedici=" + nrMedici + ", buget="
				+ buget + "]";
	}
	
	

}
