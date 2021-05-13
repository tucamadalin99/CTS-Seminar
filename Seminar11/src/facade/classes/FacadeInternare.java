package facade.classes;

public class FacadeInternare {
	
	public static String verificaPacient(Pacient pacient) {
		Medic medic = new Medic("Ion", "Cardiolog");
		StringBuilder sb = new StringBuilder();
		if(pacient.isEsteInStareGrava()) {
			sb.append("Pacientul " + pacient.getNume() + " este in stare grava, trimite catre medic. ");
		}else {
			sb.append("Pacientul nu necesita internare.");
		}
		if(medic.esteNecesaraInternare(pacient)) {
			sb.append("Medicul a decis ca este necesara internarea pacientului.");
			Salon salon = new Salon(20);
			if(salon.arePaturiLibere()) {
				sb.append(pacient.getNume() + " poate fi internat in salonul nostru.");
			}else {
				sb.append(pacient.getNume() + " nu are locuri disponibile, va fi trimis catre alt spital.");
			}
		}
		return sb.toString();
	}
}
