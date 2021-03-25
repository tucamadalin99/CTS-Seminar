package ro.ase.acs.factoryMethod;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Raceala(pretDeBaza);
	}

}
