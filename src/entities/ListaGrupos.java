package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaGrupos {
	// Attributes
	private List<String> pagode = new ArrayList<>();
	private List<String> flashback = new ArrayList<>();
	private List<String> gospel = new ArrayList<>();
	private List<String> geral = new ArrayList<>();

	// Constructor
	public ListaGrupos() {
		pagode.add("Fundo de Quintal");
		pagode.add("Dudu Nobre");

		flashback.add("A-Ha");
		flashback.add("Duran Duran");

		gospel.add("Gerson Rufino");
		gospel.add("Diante do Trono");
	}

	public ListaGrupos(List<String> pagode, List<String> flashback, List<String> gospel, List<String> geral) {
		this.pagode = pagode;
		this.flashback = flashback;
		this.gospel = gospel;
		this.geral = geral;
	}

	// gets
	public List<String> getPagode() {
		return pagode;
	}

	public List<String> getFlashback() {
		return flashback;
	}

	public List<String> getGospel() {
		return gospel;
	}

	public List<String> getGeral() {
		return geral;
	}

	// methods
	public void addPagode(String addMusica) {
		pagode.add(addMusica);
	}

	public void addFlashback(String addMusica) {
		flashback.add(addMusica);
	}

	public void addGospel(String addMusica) {
		gospel.add(addMusica);
	}

	public void addGeral(String addMusica) {
		geral.add(addMusica);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void removePagode(Integer remMusica) {
		pagode.remove(remMusica);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void removeFlashback(Integer remMusica) {
		flashback.remove(remMusica);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void removeGospel(Integer remMusica) {
		gospel.remove(remMusica);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void removeGeral(Integer remMusica) {
		geral.remove(remMusica);
	}

	public String toString() {
		return "Grupos de pagode: \n" + pagode + "\n" + "Grupos gospel: \n" + gospel + "\n" + "Grupos de Flashback: \n"
				+ flashback  + "\n" + "Grupos adicionados na lista: " + geral + "\n\n\n" ;
	}

}
