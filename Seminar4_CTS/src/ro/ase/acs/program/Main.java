package ro.ase.acs.program;
import ro.ase.cts.classes.*;

public class Main {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy clinicaLazy1 = ClinicaVeterinaraLazy.getInstance("Clinica Zurli", "Str. Berceni", 30, 560.04f);
		ClinicaVeterinaraLazy clinicaLazy2 = ClinicaVeterinaraLazy.getInstance("NU se mai schimba", "Str. neschimbata", 60, 421.43f);

		clinicaLazy1.setNume("Clinica modificata");
		clinicaLazy2.setNrMedici(70);
		
		System.out.println(clinicaLazy1.toString());
		System.out.println(clinicaLazy2.toString());
	}

}
