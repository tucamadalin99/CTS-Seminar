package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;

public class AngajatReader extends AplicantReader {

	public AngajatReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		
		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.citesteaAplicant(input2, angajat);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		input2.close();
		return angajati;
	}
}
