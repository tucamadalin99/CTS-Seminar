package ro.ase.cts.classes;

public class CategorieFactory {
	public Categorie createCategorie(CategoriiMedicamente categorieMedicamente, float pretDeBaza) throws Exception {
		switch (categorieMedicamente) {
		case raceala:
			return new Raceala(pretDeBaza);
		case durere:
			return new Durere(pretDeBaza);
		case body:
			return new Body(pretDeBaza);
		default:
			throw new Exception("Categoria medicamentului nu este corect");
		}
	}
}