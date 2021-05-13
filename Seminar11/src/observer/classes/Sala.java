package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect {
	private String numeSala;
	private List<Observer> observeri;
	
	
	
	public Sala(String numeSala) {
		super();
		this.numeSala = numeSala;
		this.observeri = new ArrayList<>();
	}
	@Override
	public void aboneazaClient(Observer ob) {
		// TODO Auto-generated method stub
		observeri.add(ob);
	}
	@Override
	public void dezaboneazaClient(Observer ob) {
		// TODO Auto-generated method stub
		observeri.remove(ob);
	}
	@Override
	public void trimiteNotificare(String mesaj) {
		// TODO Auto-generated method stub
		for(Observer ob: observeri) {
			ob.primesteNotificare(mesaj);
		}
	}
	
	public void anuntaMeciFotbal() {
		trimiteNotificare("Urmeaza un meci de fotbal.");
	}
	
	public void anuntaMeciBasket() {
		trimiteNotificare("Urmeaza un meci de basket.");
	}
}
