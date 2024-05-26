package Iphone;

import java.util.Scanner;
import Iphone.Aplicativos.*;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean rodar = true;
        Menu iphone = new Menu();

        while (rodar) {
            System.out.println("(=-{IPHONE}-=)\nQual aplicativo deseja utilizar?\n");
            System.out.println("1) Telefone\n2) Reprodutor de Música\n3) Navegador\n0) Desligar Celular");
            System.out.println("Selecione uma opção:");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: {
                    boolean subMenuTelefone = true;
                    while (subMenuTelefone) {
                        System.out.println("\n[===TELEFONE===]");
                        System.out.println("1) Ligar\n2) Atender\n3) Correio de Voz\n0) Menu\n");
                        System.out.println("Selecione uma opção:");
                        int opcao = sc.nextInt();
                        if (opcao == 1) {
                            iphone.ligar();
                        } else if (opcao == 2) {
                            iphone.atender();
                        } else if (opcao == 3) {
                            iphone.iniciarCorreioVoz();
                        } else if (opcao == 0) {
                            subMenuTelefone = false;
                        } else {
                            System.out.println("Opção Inválida!");
                        }
                    }
                    break;
                }

                case 2: {
                    boolean subMenuMusica = true;
                    while (subMenuMusica) {
                        System.out.println("\n[===REPRODUTOR DE MÚSICA===]");
                        System.out.println("1) Reproduzir Música\n2) Pausar Música\n3) Selecionar Música\n0) Menu\n");
                        System.out.println("Selecione uma opção:");
                        int opcao = sc.nextInt();
                        if (opcao == 1) {
                            iphone.tocar();
                        } else if (opcao == 2) {
                            iphone.pausar();
                        } else if (opcao == 3) {
                            iphone.selecionarMusica();
                        } else if (opcao == 0) {
                            subMenuMusica = false;
                        } else {
                            System.out.println("Opção Inválida!");
                        }
                    }
                    break;
                }

                case 3: {
                    boolean subMenuNavegador = true;
                    while (subMenuNavegador) {
                        System.out.println("\n[===NAVEGADOR===]");
                        System.out.println("1) Exibir Página\n2) Adicionar Nova Página\n3) Recarregar Página\n0) Menu\n");
                        System.out.println("Selecione uma opção:");
                        int opcao = sc.nextInt();
                        if (opcao == 1) {
                            iphone.exibirPagina();
                        } else if (opcao == 2) {
                            iphone.adicionarNovaPagina();
                        } else if (opcao == 3) {
                            iphone.recarregarPagina();
                        } else if (opcao == 0) {
                            subMenuNavegador = false;
                        } else {
                            System.out.println("Opção Inválida!");
                        }
                    }
                    break;
                }

                case 0: {
                    rodar = false;
                    System.out.println("Desligando o Iphone!");
                    break;
                }

                default: {
                    System.out.println("Opção Inválida!");
                    break;
                }
            }
        }

        sc.close();
    }
}
