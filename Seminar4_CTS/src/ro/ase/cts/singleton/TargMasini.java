package ro.ase.cts.singleton;

import java.util.Arrays;

public class TargMasini {
	private String nume;
	private String adresa;
	private double profit;
	private float[] capacitatiMotoare;
	private static TargMasini instance;
	
	
	
	
	public TargMasini(String nume, String adresa, double profit, float[] capacitatiMotoare) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.profit = profit;
		this.capacitatiMotoare = capacitatiMotoare;
	}

	


	public void setNume(String nume) {
		this.nume = nume;
	}




	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}




	public void setProfit(double profit) {
		this.profit = profit;
	}




	public void setCapacitatiMotoare(float[] capacitatiMotoare) {
		this.capacitatiMotoare = capacitatiMotoare;
	}




	public static void setInstance(TargMasini instance) {
		TargMasini.instance = instance;
	}




	synchronized public static TargMasini getInstance(String nume, String adresa, double profit, float[] capacitatiMotoare) {
		if(instance == null) {
			instance = new TargMasini(nume, adresa, profit, capacitatiMotoare);
		}
		
		return instance;
	}




	@Override
	public String toString() {
		return "TargMasini [nume=" + nume + ", adresa=" + adresa + ", profit=" + profit + ", capacitatiMotoare="
				+ Arrays.toString(capacitatiMotoare) + "]";
	}
	
	
	
	

}
