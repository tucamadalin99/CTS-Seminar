package main.pack;

import classes.pack.*;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper keeper = new Zookeeper("Dani");
		
		Girrafe g1 = new Girrafe("Girafa",45,4);
		Girrafe g2 = new Girrafe("Girafa2",41,3);
		Zebra z1 = new Zebra("Zebra", 43, 1);
		Zebra z2 = new Zebra("Zebra", 49, 1);
		
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		
		zoo.feedAllAnimals();

	}

}
