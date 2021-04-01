package ro.ase.cts.builderv1.program;

import ro.ase.cts.builderv1.classes.Builder;
import ro.ase.cts.builderv2.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare = new Builder(1).setBauturaRacoritoare(true).build();
		System.out.println(rezervare.toString());
		
		Rezervare rezervare1 = new Builder(2).setMancareInclusa(true).build();
		System.out.println(rezervare1.toString());
	}

}
