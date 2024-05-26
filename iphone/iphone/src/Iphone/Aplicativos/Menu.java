package Iphone.Aplicativos;

import Iphone.Aplicativos.Ligacao.AparelhoTelefonico;
import Iphone.Aplicativos.Musica.ReprodutorMusical;
import Iphone.Aplicativos.Navegador.NavegadorInternet;

public class Menu implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public void atender(){
        System.out.println("Ligação Atendida!");
    }

    public void ligar(){
        System.out.println("Ligando...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o correio de voz...");
    }

    public void tocar(){
        System.out.println("Tocando música...");
    }

    public void pausar(){
        System.out.println("Música pausada!");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música...");
    }

    public void exibirPagina(){
        System.out.println("Página sendo exibida!");
    }
    
    public void adicionarNovaPagina(){
        System.out.println("Nova página sendo exibida!");
    }
    
    public void recarregarPagina(){
        System.out.println("Página recarregada!");
    }
}
