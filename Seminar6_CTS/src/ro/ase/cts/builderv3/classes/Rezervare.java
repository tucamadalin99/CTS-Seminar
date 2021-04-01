package ro.ase.cts.builderv3.classes;

public class Rezervare {
	public static class BuilderV3 implements IBuild{
		//Atribute builder inner
		private boolean mancareInclusa;
		private boolean scaunErgonomic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;
		
		public BuilderV3 setMancare(boolean mancare) {
			this.mancareInclusa = mancare;
			return this;
		}
		
		public BuilderV3 setScaun(boolean scaun) {
			this.scaunErgonomic = scaun;
			return this;
		}
		
		public BuilderV3 setBautura(boolean bautura) {
			this.bauturaRacoritoare = bautura;
			return this;
		}
		
		public BuilderV3 setMuzica(String gen) {
			this.genMuzica = gen;
			return this;
		}
		
		public BuilderV3 setCod(int cod) {
			this.codRezervare = cod;
			return this;
		}
		
		public BuilderV3 setMuzicaAmbient(boolean ambient) {
			this.muzicaAmbientala = ambient;
			return this;
		}
		
		public Rezervare build() {
			return new Rezervare(this);
		}
	}
	
	//Atribute clasa concreta
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	
	
	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare,
			boolean muzicaAmbientala, String genMuzica, int codRezervanre) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervanre;
	}
	public Rezervare(BuilderV3 builderV3) {
		this.bauturaRacoritoare = builderV3.bauturaRacoritoare;
		this.scaunErgonomic = builderV3.scaunErgonomic;
		this.muzicaAmbientala = builderV3.muzicaAmbientala;
		this.genMuzica = builderV3.genMuzica;
		this.codRezervare = builderV3.codRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala
				+ ", genMuzica=" + genMuzica + ", codRezervanre=" + codRezervare + "]";
	}
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervanre() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	
}
