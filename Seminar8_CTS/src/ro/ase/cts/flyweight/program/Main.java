package ro.ase.cts.flyweight.program;
import ro.ase.cts.flyweight.clase.*;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare rez1 = new Rezervare(1,2, "12:00");
		Rezervare rez2 = new Rezervare(2,5, "14:00");
		
		FabricaRezervari fabrica = new FabricaRezervari();
		fabrica.getClient("dani@gmail.com").afisareInfo(rez1);
		fabrica.getClient("dani@gmail.com").afisareInfo(rez2);
		Rezervare rez3 = new Rezervare(2,4, "17:30");
		fabrica.getClient("email").afisareInfo(rez3);
				
	}
}
