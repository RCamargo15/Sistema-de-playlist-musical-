/**
 * @author RCamargo15
 */
package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.ListaGrupos;
import entities.ListaMusicas;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		ListaGrupos listaGrupos = new ListaGrupos();
		ListaMusicas listaMusicas = new ListaMusicas();
		Scanner sc = new Scanner(System.in);
		String musicaAdd;
		String musica;
		String choice;
		Integer option;
		Integer dialogButton;
		Boolean find;

		System.out.println("Bem vindo ao programa de música. A seguir, algumas das opções do que pode fazer: \n");

		try {
			do {
				// menu para interação
				System.out.println("1 - Exibir todas as músicas da playlist");
				System.out.println("2 - Remover uma música da playlist");
				System.out.println("3 - Buscar uma música dentro da lista de música");
				System.out.println("4 - Quantidade de músicas dentro da lista");
				System.out.println("5 - Adicionar uma música na playlist");
				System.out.println("6 - SAIR");
				System.out.println("Digite o número da opção desejada: ");
				option = sc.nextInt();

				switch (option) {
				case 1:
					// EXIBIR TODAS AS MÚSICAS E GRUPOS
					System.out.println(listaGrupos);
					System.out.println(listaMusicas);
					break;

				case 2:
					// REMOÇÃO DE MÚSICAS DA LISTA
					System.out.println("Primeiro, escolha de qual gênero musical deseja remover: ");
					System.out.println("1 - Pagode \n2 - Gospel \n3 - Flashback \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						sc.nextLine();
						for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaPagode().get(i));
						}
						System.out.println("Digite o nome da música que deseja remover (como apresentado na lista): ");
						choice = sc.nextLine();
						listaMusicas.removePagode(choice);

						System.out.println("Lista atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaPagode().get(i));
						}
						break;
					}

					if (option == 2) {
						sc.nextLine();
						System.out.println("Digite o nome da música que deseja remover (como apresentado na lista): ");
						for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGospel().get(i));
						}
						choice = sc.nextLine();
						listaMusicas.removeGospel(choice);

						System.out.println("Lista atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGospel().get(i));
						}
						break;
					}

					if (option == 3) {
						sc.nextLine();
						System.out.println("Digite o nome da música que deseja remover (como apresentado na lista): ");
						for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaFlashback().get(i));
						}
						choice = sc.nextLine();
						listaMusicas.removeFlashback(choice);

						System.out.println("Lista atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaFlashback().get(i));
						}
						break;
					}
					if (option == 4) {
						sc.nextLine();
						System.out.println("Digite o nome da música que deseja remover (como apresentado na lista): ");
						for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGeral().get(i));
						}
						choice = sc.nextLine();
						listaMusicas.removeGeral(choice);

						System.out.println("Lista atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGeral().get(i));
						}
						break;
					}

				case 3:
					// BUSCA DE MÚSICAS POR NOME
					System.out.println(
							"Escolha o gênero musical: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();
					if (option == 1) {
						System.out.println("Digite o nome da música que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
								if (listaMusicas.getMusicaPagode().contains(musica)) {
									System.out.println("Música encontrada na posição: "
											+ listaMusicas.getMusicaPagode().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("Música não encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 2) {
						System.out.println("Digite o nome da música que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
								if (listaMusicas.getMusicaGospel().contains(musica)) {
									System.out.println("Música encontrada na posição: "
											+ listaMusicas.getMusicaGospel().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("Música não encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 3) {
						System.out.println("Digite o nome da música que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
								if (listaMusicas.getMusicaFlashback().contains(musica)) {
									System.out.println("Música encontrada na posição: "
											+ listaMusicas.getMusicaFlashback().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("Música não encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 4) {
						System.out.println("Digite o nome da música que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
								if (listaMusicas.getMusicaGeral().contains(musica)) {
									System.out.println("Música encontrada na posição: "
											+ listaMusicas.getMusicaGeral().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("Música não encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
				case 4:
					// RETORNO DE QUANTIDADE DE MÚSICAS DA LISTA
					System.out.println(
							"Escolha o gênero musical: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaPagode().size()
								+ " músicas nesta lista.");
						break;
					}
					if (option == 2) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaGospel().size()
								+ " músicas nesta lista.");
						break;
					}
					if (option == 3) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaFlashback().size()
								+ " músicas nesta lista.");
						break;
					}
					if (option == 4) {
						System.out.println(
								"Existem no momento " + listaMusicas.getMusicaGeral().size() + " músicas nesta lista.");
						break;
					}

				case 5:

					// ADIÇÃO DE MÚSICAS
					System.out.println(
							"Escolha o gênero musical no qual deseja inserir alguma música: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						System.out.print("Digite o nome da música que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addPagode(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da música: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addPagode(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de músicas de pagode atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaPagode().get(i));
						}
					}

					if (option == 2) {
						System.out.println("Digite o nome da música que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addGospel(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da música: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addGospel(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de músicas gospel atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGospel().get(i));
						}
					}

					if (option == 3) {
						System.out.println("Digite o nome da música que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addFlashback(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da música: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addFlashback(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de músicas flashback atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaFlashback().get(i));
						}
					}

					if (option == 4) {
						System.out.println("Digite o nome da música que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addGeral(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da música: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addGeral(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova música?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}
						System.out.println("Lista de músicas adicionadas recentemente atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGeral().get(i));
						}
					}
				default:
					System.out.println("Escolha apenas entre as opções disponíveis no menu!");
				}
			} while (option != 6);
		}
		catch (InputMismatchException e) {
			System.out.println("Valor digitado de forma incorreta. Siga as instruções e reinicie o programa.");
		} catch (IllegalArgumentException e) {
			System.out.println("Siga as instruções!");
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado. Reinicie o programa e siga as instruções.");
		}
		System.out.println("APPLICATION STOPPED");
		sc.close();
	}
}
