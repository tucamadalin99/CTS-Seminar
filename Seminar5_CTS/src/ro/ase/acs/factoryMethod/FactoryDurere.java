package ro.ase.acs.factoryMethod;

public class FactoryDurere implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Durere(pretDeBaza);
	}

}
