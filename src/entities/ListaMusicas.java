package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaMusicas extends ListaGrupos {
	// ATTRIBUTES
	private List<String> musicaPagode = new ArrayList<>();
	private List<String> musicaFlashback = new ArrayList<>();
	private List<String> musicaGospel = new ArrayList<>();
	private List<String> musicaGeral = new ArrayList<>();

	// CONSTRUCTOR
	public ListaMusicas() {
		musicaPagode.add("O mapa da mina");
		musicaPagode.add("A Amizade");
		musicaPagode.add("A batucada dos nossos tantãs");
		musicaPagode.add("Nosso grito");
		musicaPagode.add("Parabéns pra você");
		musicaPagode.add("Amor dos deuses");
		musicaPagode.add("Frasco Pequeno");
		musicaPagode.add("Lucidez");
		musicaPagode.add("Do fundo do nosso quintal");
		musicaPagode.add("Oitava cor");
		musicaPagode.add("A grande família");
		musicaPagode.add("Singelo menestrel");
		musicaPagode.add("Favo de mel");
		musicaPagode.add("Tempos de dondom");
		musicaPagode.add("Estava perdido num mar");
		musicaPagode.add("É preciso muito amor");
		musicaPagode.add("Quem é ela");
		musicaPagode.add("Chegue Mais");
		musicaPagode.add("Papagaio");

		musicaFlashback.add("Take on me");
		musicaFlashback.add("Hunting high and low");
		musicaFlashback.add("Crying in the rain");
		musicaFlashback.add("Stay on these roads");
		musicaFlashback.add("You are the one");
		musicaFlashback.add("I've been losing you");
		musicaFlashback.add("Early morning");
		musicaFlashback.add("There's never a forever thing");
		musicaFlashback.add("The sun always shine on TV");
		musicaFlashback.add("Manhattan Skyline");
		musicaFlashback.add("Ordinary World");
		musicaFlashback.add("Save a prayer");
		musicaFlashback.add("Come Undone");
		musicaFlashback.add("A Matter of feeling");
		musicaFlashback.add("Hungry like a wolf");
		musicaFlashback.add("A view to kill");
		musicaFlashback.add("Notorious");
		musicaFlashback.add("Perfecy Day");
		musicaFlashback.add("Rio");

		musicaGospel.add("Vai passar");
		musicaGospel.add("Dia de sol");
		musicaGospel.add("Além da medicina");
		musicaGospel.add("Vem cear comigo");
		musicaGospel.add("Vai dar tudo certo");
		musicaGospel.add("Reconstrução");
		musicaGospel.add("Barrabás");
		musicaGospel.add("Olha eu aqui");
		musicaGospel.add("Casa do rei");
		musicaGospel.add("A Ele a glória");
		musicaGospel.add("Me ama");
		musicaGospel.add("Canção do Apocalipse");
		musicaGospel.add("Te Agradeço");
		musicaGospel.add("Águas purificadoras");
		musicaGospel.add("Preciso de Ti");
		musicaGospel.add("Aclame ao Senhor");
		musicaGospel.add("Coração Igual ao Teu");
		musicaGospel.add("Nos Braços do Pai");
		musicaGospel.add("Porque Dele por Ele");
	}

	public ListaMusicas(List<String> musicaPagode, List<String> musicaFlashback, List<String> musicaGospel,
			List<String> musicaGeral) {
		this.musicaPagode = musicaPagode;
		this.musicaFlashback = musicaFlashback;
		this.musicaGospel = musicaGospel;
		this.musicaGeral = musicaGeral;
	}

	// GETS
	public List<String> getMusicaPagode() {
		return musicaPagode;
	}

	public List<String> getMusicaFlashback() {
		return musicaFlashback;
	}

	public List<String> getMusicaGospel() {
		return musicaGospel;
	}

	public List<String> getMusicaGeral() {
		return musicaGeral;
	}

	// METHOD
		//Adicionar
	@Override
	public void addPagode(String addMusica) {
		musicaPagode.add(addMusica);
	}

	@Override
	public void addFlashback(String addMusica) {
		musicaFlashback.add(addMusica);
	}

	@Override
	public void addGospel(String addMusica) {
		musicaGospel.add(addMusica);
	}

	@Override
	public void addGeral(String addMusica) {
		musicaGeral.add(addMusica);
	}

		//Remover
	public void removePagode(String removeMusica) {
		musicaPagode.remove(removeMusica);
	}
	public void removeFlashback(String removeMusica) {
		musicaFlashback.remove(removeMusica);
	}
	public void removeGospel(String removeMusica) {
		musicaGospel.remove(removeMusica);
	}
	public void removeGeral(String removeMusica) {
		musicaGeral.remove(removeMusica);
	}

	@Override
	public String toString() {
		return "Pagodes da playlist: \n" + musicaPagode + "\n" + "Gospel na playlist: \n" + musicaGospel + "\n"
				+ "Flashbacks na playlist: \n" + musicaFlashback + "\n" + "Músicas adicionadas recentemente da playlist: \n" + musicaGeral + "\n\n\n";
				}
}
