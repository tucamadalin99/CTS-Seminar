package ro.ase.cts.state.classes;

public class StareLibera implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa " + masa.getNrMasa() + " a fost eliberata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa selectata este deja libera.");
		}
	}

}
