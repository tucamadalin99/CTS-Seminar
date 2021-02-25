package classes.pack;

public class Girrafe extends Animal {

	private float inaltime;
	
	public Girrafe(String name, float greutate, float inaltime) {
		super(name, greutate);
		this.inaltime = inaltime;
	}

	public float getInaltime() {
		return inaltime;
	}

	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}

	
	
	
}
