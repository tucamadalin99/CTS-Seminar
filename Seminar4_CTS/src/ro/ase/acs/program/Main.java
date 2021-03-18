package ro.ase.acs.program;
import ro.ase.cts.classes.*;
import ro.ase.cts.singleton.*;

public class Main {

	public static void main(String[] args) {
//		ClinicaVeterinaraEager clinica1 = ClinicaVeterinaraEager.getInstance();
//		ClinicaVeterinaraEager clinica2 = ClinicaVeterinaraEager.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
//		
//		ClinicaVeterinaraLazy clinicaLazy1 = ClinicaVeterinaraLazy.getInstance("Clinica Zurli", "Str. Berceni", 30, 560.04f);
//		ClinicaVeterinaraLazy clinicaLazy2 = ClinicaVeterinaraLazy.getInstance("NU se mai schimba", "Str. neschimbata", 60, 421.43f);
//
//		clinicaLazy1.setNume("Clinica modificata");
//		clinicaLazy2.setNrMedici(70);
//		
//		System.out.println(clinicaLazy1.toString());
//		System.out.println(clinicaLazy2.toString());
		
		TargMasini targ1 = TargMasini.getInstance("Succes", "Str. Victoriei", 25000.40, new float[]{1.4f, 1.6f, 1.8f});
		TargMasini targ2 = TargMasini.getInstance("Succes2", "Str. Victoriei2", 24000.40, new float[]{1.2f, 1.6f, 1.8f});
		targ1.setAdresa("Str. Hazului");
		
		System.out.println(targ1.toString());
		System.out.println(targ2.toString());
	}

}
