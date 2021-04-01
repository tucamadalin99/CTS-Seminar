package ro.ase.cts.builderv2.classes;

import ro.ase.cts.builderv1.classes.Builder;

public class BuilderV2 implements IBuilder{
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV2(int codRezervare) {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = codRezervare;
	}
	
	public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public BuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}

	public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public BuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	public BuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}



	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(mancareInclusa,scaunErgonomic,muzicaAmbientala,bauturaRacoritoare,genMuzica,codRezervare);
	}

}
