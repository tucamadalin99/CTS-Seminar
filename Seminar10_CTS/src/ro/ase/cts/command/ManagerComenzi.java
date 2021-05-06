package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	public List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}
	
	public void invoca(Command comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(this.comenzi.size() != 0) {
			this.comenzi.get(0).executa();
		}
	}
}
