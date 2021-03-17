package ro.ase.cts.classes;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare = 10;
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Angajat:" + super.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	
	@Override
	public float getSumaFinantare() {
		// TODO Auto-generated method stub
		return this.sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(float sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	@Override
	public void afiseazaSumaFinantare() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+this.sumaFinantare+" Euro/zi in proiect.");
	}
	
	
}
