package ro.ase.cts.classes;

public class Card implements ModPlata {
	private float sold;
	
	
	
	public Card(float sold) {
		super();
		this.sold = sold;
	}



	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(sold >= suma) {
			System.out.println("Se plateste card suma de: " + suma);
			this.sold -= suma;
		}else {
			System.out.println("Clientul nu are suma suficienta in sold.");
		}
	}

}
