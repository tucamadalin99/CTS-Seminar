package ro.ase.cts.proxy.clase;

public class Rezervare implements IRezervare {
	private int nrMasa;
	private int nrPers;
	
	public Rezervare(int nrMasa, int nrPers) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
	}

	public int getNrPers() {
		return nrPers;
	}
	

	@Override
	public void anuntaRezervare() {
		// TODO Auto-generated method stub
		System.out.println("Masa " + nrMasa + " a fost rezervata de " + nrPers);
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public void setNrPers(int nrPers) {
		this.nrPers = nrPers;
	}
	
	

	
	
}
