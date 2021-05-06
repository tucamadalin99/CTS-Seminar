package ro.ase.cts.command;

public class Depunere extends Command{

	public Depunere(ContBancar cont, float pret) {
		super(cont, pret);
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());	
	}
}