package template.classes;

public abstract class SpectatorAbstract {
	
	public final void intrarePeStadion() {
		aseazareLaCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
	
	public abstract void aseazareLaCoada();
	public abstract void prezintaBilet();
	public abstract void realizeazaControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
}
