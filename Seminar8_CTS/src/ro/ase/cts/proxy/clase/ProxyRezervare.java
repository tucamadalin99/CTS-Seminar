package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IRezervare {
	private final static int NR_MIN_PERSOANE = 4;
	private IRezervare rezervare;
	
	
	
	public ProxyRezervare(IRezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}



	@Override
	public void anuntaRezervare() {
		// TODO Auto-generated method stub
		if(((Rezervare) rezervare).getNrPers() >= NR_MIN_PERSOANE) {
			rezervare.anuntaRezervare();
		}else {
			System.out.println("Persoanele se pot prezenta fizic la restaurant.");
		}
		
	}

}
