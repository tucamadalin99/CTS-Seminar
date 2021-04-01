package ro.ase.cts.builderv3.program;

import ro.ase.cts.builderv3.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r = new Rezervare.BuilderV3().setBautura(true).setCod(10).build();
		System.out.println(r.toString());
	}

}
