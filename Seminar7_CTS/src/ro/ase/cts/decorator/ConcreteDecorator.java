package ro.ase.cts.decorator;

public class ConcreteDecorator extends AbastractDecorator {

	public ConcreteDecorator(ICard card) {
		super(card);

	}

	@Override
	public void platesteContactless() {
		System.out.println("Detinatoru: " + super.getCard().getDetinatorCard() + "plateste contactless");

	}


}