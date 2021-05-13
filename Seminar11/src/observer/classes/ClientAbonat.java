package observer.classes;

public class ClientAbonat implements Observer {
	private String nume;
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteNotificare(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Buna " + nume +"! " + mesaj);
	}

}
