package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.IOptiuneMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
	
	public static void main(String[] args) {
		IOptiuneMeniu meniu = new Sectiune("Meniu");
		IOptiuneMeniu optiune1 = new Sectiune("bauturi");
		IOptiuneMeniu optiune2 = new Sectiune("desert");
		
		IOptiuneMeniu itm1 = new Item("Cola");
		IOptiuneMeniu itm2 = new Item("Frappe");
		IOptiuneMeniu itm3 = new Item("Clatite");
		
		try {
			optiune1.adaugaNod(itm1);
			optiune1.adaugaNod(itm2);
			optiune2.adaugaNod(itm3);
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			meniu.descriere();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
