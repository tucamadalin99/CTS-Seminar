package classes.pack;

public class Zookeeper {
	
	private String name;

	public void feed(Animal a) {
		System.out.println("Animalul " + a.getName() + " a fost hranit.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}
