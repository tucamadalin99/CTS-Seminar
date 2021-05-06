package ro.ase.cts.command;

public class Constituire extends Command{

	public Constituire(ContBancar cont,float suma) {
		super(cont,suma);
	}

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());		
	}

	
}
