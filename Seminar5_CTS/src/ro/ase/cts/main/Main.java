package ro.ase.cts.main;
import ro.ase.cts.classes.*;

public class Main {
	
	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.raceala;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CategorieFactory categorieFactory = new CategorieFactory();
			Categorie durere  = categorieFactory.createCategorie(CategoriiMedicamente.durere, 10);
			Categorie body = categorieFactory.createCategorie(CategoriiMedicamente.body, 15);
			Categorie categorie = categorieFactory.createCategorie(CategoriiMedicamente.body, 15);

			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
