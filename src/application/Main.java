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

		System.out.println("Bem vindo ao programa de m�sica. A seguir, algumas das op��es do que pode fazer: \n");

		try {
			do {
				// menu para intera��o
				System.out.println("1 - Exibir todas as m�sicas da playlist");
				System.out.println("2 - Remover uma m�sica da playlist");
				System.out.println("3 - Buscar uma m�sica dentro da lista de m�sica");
				System.out.println("4 - Quantidade de m�sicas dentro da lista");
				System.out.println("5 - Adicionar uma m�sica na playlist");
				System.out.println("6 - SAIR");
				System.out.println("Digite o n�mero da op��o desejada: ");
				option = sc.nextInt();

				switch (option) {
				case 1:
					// EXIBIR TODAS AS M�SICAS E GRUPOS
					System.out.println(listaGrupos);
					System.out.println(listaMusicas);
					break;

				case 2:
					// REMO��O DE M�SICAS DA LISTA
					System.out.println("Primeiro, escolha de qual g�nero musical deseja remover: ");
					System.out.println("1 - Pagode \n2 - Gospel \n3 - Flashback \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						sc.nextLine();
						for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaPagode().get(i));
						}
						System.out.println("Digite o nome da m�sica que deseja remover (como apresentado na lista): ");
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
						System.out.println("Digite o nome da m�sica que deseja remover (como apresentado na lista): ");
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
						System.out.println("Digite o nome da m�sica que deseja remover (como apresentado na lista): ");
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
						System.out.println("Digite o nome da m�sica que deseja remover (como apresentado na lista): ");
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
					// BUSCA DE M�SICAS POR NOME
					System.out.println(
							"Escolha o g�nero musical: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();
					if (option == 1) {
						System.out.println("Digite o nome da m�sica que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
								if (listaMusicas.getMusicaPagode().contains(musica)) {
									System.out.println("M�sica encontrada na posi��o: "
											+ listaMusicas.getMusicaPagode().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("M�sica n�o encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 2) {
						System.out.println("Digite o nome da m�sica que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
								if (listaMusicas.getMusicaGospel().contains(musica)) {
									System.out.println("M�sica encontrada na posi��o: "
											+ listaMusicas.getMusicaGospel().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("M�sica n�o encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 3) {
						System.out.println("Digite o nome da m�sica que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
								if (listaMusicas.getMusicaFlashback().contains(musica)) {
									System.out.println("M�sica encontrada na posi��o: "
											+ listaMusicas.getMusicaFlashback().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("M�sica n�o encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
					if (option == 4) {
						System.out.println("Digite o nome da m�sica que procura: ");
						sc.nextLine();
						musica = sc.nextLine();
						find = false;
						while (find != true) {
							for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
								if (listaMusicas.getMusicaGeral().contains(musica)) {
									System.out.println("M�sica encontrada na posi��o: "
											+ listaMusicas.getMusicaGeral().indexOf(musica) + " - " + musica);
									find = true;
									break;
								} else {
									System.out.println("M�sica n�o encontrada");
									find = true;
									break;
								}
							}
						}
						break;
					}
				case 4:
					// RETORNO DE QUANTIDADE DE M�SICAS DA LISTA
					System.out.println(
							"Escolha o g�nero musical: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaPagode().size()
								+ " m�sicas nesta lista.");
						break;
					}
					if (option == 2) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaGospel().size()
								+ " m�sicas nesta lista.");
						break;
					}
					if (option == 3) {
						System.out.println("Existem no momento " + listaMusicas.getMusicaFlashback().size()
								+ " m�sicas nesta lista.");
						break;
					}
					if (option == 4) {
						System.out.println(
								"Existem no momento " + listaMusicas.getMusicaGeral().size() + " m�sicas nesta lista.");
						break;
					}

				case 5:

					// ADI��O DE M�SICAS
					System.out.println(
							"Escolha o g�nero musical no qual deseja inserir alguma m�sica: \n1 - Pagode \n2 - Gospel \n3 - FlashBack \n4 - Adicionadas recentemente");
					option = sc.nextInt();

					if (option == 1) {
						System.out.print("Digite o nome da m�sica que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addPagode(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da m�sica: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addPagode(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de m�sicas de pagode atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaPagode().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaPagode().get(i));
						}
					}

					if (option == 2) {
						System.out.println("Digite o nome da m�sica que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addGospel(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da m�sica: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addGospel(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de m�sicas gospel atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGospel().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGospel().get(i));
						}
					}

					if (option == 3) {
						System.out.println("Digite o nome da m�sica que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addFlashback(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da m�sica: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addFlashback(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}

						System.out.println("Lista de m�sicas flashback atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaFlashback().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaFlashback().get(i));
						}
					}

					if (option == 4) {
						System.out.println("Digite o nome da m�sica que deseja inserir: ");
						sc.nextLine();
						musicaAdd = sc.nextLine();
						listaMusicas.addGeral(musicaAdd);
						dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
						if (dialogButton == JOptionPane.YES_OPTION) {
							do {
								System.out.println("Insira o nome da m�sica: ");
								musicaAdd = sc.nextLine();
								listaMusicas.addGeral(musicaAdd);
								dialogButton = JOptionPane.showConfirmDialog(null, "Deseja inserir uma nova m�sica?");
							} while (dialogButton != JOptionPane.NO_OPTION);
						}
						System.out.println("Lista de m�sicas adicionadas recentemente atualizada: ");
						for (int i = 0; i < listaMusicas.getMusicaGeral().size(); i++) {
							System.out.println(i + " - " + listaMusicas.getMusicaGeral().get(i));
						}
					}
				default:
					System.out.println("Escolha apenas entre as op��es dispon�veis no menu!");
				}
			} while (option != 6);
		}
		catch (InputMismatchException e) {
			System.out.println("Valor digitado de forma incorreta. Siga as instru��es e reinicie o programa.");
		} catch (IllegalArgumentException e) {
			System.out.println("Siga as instru��es!");
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado. Reinicie o programa e siga as instru��es.");
		}
		System.out.println("APPLICATION STOPPED");
		sc.close();
	}
}
