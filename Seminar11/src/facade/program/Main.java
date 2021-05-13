package facade.program;
import facade.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pacient p1 = new Pacient("Dani", false);
		Pacient p2 = new Pacient("Catalin", true);
		
		System.out.println(FacadeInternare.verificaPacient(p1));
		System.out.println(FacadeInternare.verificaPacient(p2));

	}

}
