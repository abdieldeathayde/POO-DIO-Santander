package desafioDio;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();


        String musica = sc.nextLine();
        String numero = sc.nextLine();
        String url = sc.nextLine();

        switch(opcao){
            case "1" -> reprodutorMusical.tocar();
            case "2" -> reprodutorMusical.pausar();
            case "3" -> reprodutorMusical.selecionarMusica(musica);
            case "4" -> reprodutorMusical.pularMusica(musica);
            case "5" -> aparelhoTelefonico.ligar(numero);
            case "6" -> aparelhoTelefonico.atender();
            case "7" -> aparelhoTelefonico.iniciarCorreioVoz();
            case "8" -> navegadorInternet.adicionarNovaAba();
            case "9" -> navegadorInternet.atualizarPagina();
            case "10" -> navegadorInternet.exibirPagina(url);
         }
    }
}
