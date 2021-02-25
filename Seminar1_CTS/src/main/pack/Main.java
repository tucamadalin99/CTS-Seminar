package main.pack;

import classes.pack.*;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
		
	}

}
