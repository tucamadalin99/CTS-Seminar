package ro.ase.cts.strategy.classes;

public class Cash implements ModPlata {

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		System.out.println("Se plateste cash suma de: " + suma);
	}

}
