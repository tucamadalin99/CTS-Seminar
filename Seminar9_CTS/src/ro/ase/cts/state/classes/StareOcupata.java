package ro.ase.cts.state.classes;

public class StareOcupata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStareMasa() instanceof StareOcupata)) {
			masa.setStareMasa(this);
			System.out.println("Masa " + masa.getNrMasa() + " poate fi ocupata.");
		}else {
			System.out.println("Masa este deja ocupata.");
		}
	}

}
