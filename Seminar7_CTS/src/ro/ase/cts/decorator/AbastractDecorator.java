package ro.ase.cts.decorator;

public abstract class AbastractDecorator implements ICard {

	private ICard card;

	public ICard getCard() {
		return card;
	}

	public AbastractDecorator(ICard card) {
		super();
		this.card = card;
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();

	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();
	}

	@Override
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	};

	public abstract void platesteContactless();

}