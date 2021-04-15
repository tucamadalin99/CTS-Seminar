package ro.ase.cts.flyweight.clase;

public class Client implements AbstractFlyweight {
	private String nume;
	private String nrTel;
	private String email;
	public Client(String nume, String nrTel, String email) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTel=" + nrTel + ", email=" + email + "]";
	}



	@Override
	public void afisareInfo(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " " + rezervare.toString());
		
	}
	
	
}
