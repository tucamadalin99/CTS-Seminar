package ro.ase.cts.main;

import ro.ase.cts.adapter.*;
import ro.ase.cts.decorator.AbastractDecorator;
import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.ConcreteDecorator;
import ro.ase.cts.decorator.ICard;

public class Main {
	
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter, "Ionel", 245.50f);
		
			ICard card = new Card("Mirel");
			
			card.platesteFizic();
			card.platesteOnline();
			
			AbastractDecorator decorator = new ConcreteDecorator(card);

	

	}

}
