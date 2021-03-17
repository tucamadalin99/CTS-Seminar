package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;


	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}
	

	public String getNume() {
		return nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public abstract float getSumaFinantare();

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	} 
	
	
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public abstract void afiseazaSumaFinantare();
	

	public void setNrProiecte(int nrProiecte, String[] vect) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = vect;
	}

	public void afiseazaStatus(Proiect proiect) {
		String aplicant = "Aplicantul " + nume + " " + prenume;
		 String rezultatAcceptare =
				punctaj > proiect.getPragAcceptare() ? " a fost acceptat" : " nu a fost acceptat";
				System.out.println(aplicant + rezultatAcceptare);
	}


	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nrProiecte=" + nrProiecte + ", denumiriProiecte=" + Arrays.toString(denumiriProiecte) + "]";
	}
	
	

}
