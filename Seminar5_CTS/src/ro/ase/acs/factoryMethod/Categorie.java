package ro.ase.acs.factoryMethod;

public abstract class Categorie {
	float pretDeBaza;

	public Categorie(float pretDeBaza) {
		this.pretDeBaza = pretDeBaza;
	}

	@Override
	public String toString() {
		return "Categorie [pretDeBaza=" + pretDeBaza + "]";
	}
	
	

}
