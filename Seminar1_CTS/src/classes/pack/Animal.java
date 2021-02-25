package classes.pack;

public abstract class Animal {
	
	private String name;
	private float greutate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGreutate() {
		return greutate;
	}
	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}
	public Animal(String name, float greutate) {
		super();
		this.name = name;
		this.greutate = greutate;
	}
	
	
}
