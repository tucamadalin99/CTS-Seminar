package ro.ase.cts.builderv2.program;
import ro.ase.cts.builderv2.*;
import ro.ase.cts.builderv2.classes.BuilderV2;
import ro.ase.cts.builderv2.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderV2 builderV2 = new BuilderV2(1);
		builderV2.setBauturaRacoritoare(true);
		builderV2.setMancareInclusa(true);
		
		Rezervare rezervare1 = builderV2.setCodRezervare(2).build();
		
		System.out.println(rezervare1.toString());
	}

}
