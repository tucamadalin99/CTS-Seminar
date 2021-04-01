package ro.ase.cts.builderv1.classes;

import ro.ase.cts.builderv2.classes.Rezervare;

public class Builder implements IBuilder {
	private Rezervare rezervare;
	
	public Builder(int codRezervare) {
		rezervare = new Rezervare(false,false,false,false,"usoara", codRezervare);
	}
	
	public Builder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}

	public Builder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}

	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public Builder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public Builder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
}
