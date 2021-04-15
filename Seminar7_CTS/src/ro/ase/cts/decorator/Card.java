package ro.ase.cts.decorator;

public class Card implements ICard {
	private String detinatorCard;

	public String getDetinatorCard() {
		return detinatorCard;
	}

	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println("Detinatorul: " + detinatorCard + " platit online");

	}

	@Override
	public void platesteFizic() {
		System.out.println("Detinatorul: " + detinatorCard + " platit fizic");
	}

}