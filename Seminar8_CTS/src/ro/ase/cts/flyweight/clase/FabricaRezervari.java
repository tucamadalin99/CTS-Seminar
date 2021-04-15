package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String, AbstractFlyweight> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String, AbstractFlyweight>();
	}
	
	public AbstractFlyweight getClient(String email) {
		AbstractFlyweight client = clienti.get(email);
		if(client == null) {
			client = new Client("Dani", "0723312230", email);
			clienti.put(email, client);
		}
		
		return client;
	}
	
	
}
