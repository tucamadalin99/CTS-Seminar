package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.classes.Bilet;
import ro.ase.cts.prototype.classes.Client;

public class Main {

	public static void main(String[] args) {
		Client client = new Client(1,"Andrei",20);
		Client client1 =(Client) client.copy();
		System.out.println(client1.toString());
		
		Bilet bilet1 = new Bilet(0, "Echipa1", "Echipa2", "25");
		Bilet bilet2 = (Bilet) bilet1.copy();
		bilet2.setCod(1);
		
		System.out.println(bilet2.toString());
	}

}
