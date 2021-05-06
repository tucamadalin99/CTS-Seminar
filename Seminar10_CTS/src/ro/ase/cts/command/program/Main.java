package ro.ase.cts.command.program;

import ro.ase.cts.command.Constituire;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.Depunere;
import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.Retragere;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi managerComenzi = new ManagerComenzi();
		managerComenzi.invoca(new Constituire(new ContBancar("Madalin"), 500));
		managerComenzi.invoca(new Depunere(new ContBancar("Cezin"), 900));
		managerComenzi.invoca(new Retragere(new ContBancar("Cebuc"), 400));
	}

}
