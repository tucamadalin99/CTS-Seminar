package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRezervare rez = new Rezervare(1, 2);
		rez.anuntaRezervare();
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rez);
		proxy.anuntaRezervare();
		((Rezervare)rez).setNrPers(4);
		proxy.anuntaRezervare();
	}

}
