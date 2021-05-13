package observer.classes;

public interface Subiect {
	void aboneazaClient(Observer ob);
	void dezaboneazaClient(Observer ob);
	void trimiteNotificare(String mesaj);
}
