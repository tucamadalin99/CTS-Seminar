package ro.ase.acs.factoryMethod;

public class Main {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryGripa();
	}
	
	
	public static void printeazaCategorie(FactoryCategorie factoryCateg, float pretDeBaza) {
		Categorie categorie = factoryCateg.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 25);
	}
}
