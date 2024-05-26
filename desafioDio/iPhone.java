package desafioDio;

import java.util.Scanner;

class iPhone {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String musica = sc.nextLine();
//
//
//        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
//        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
//        NavegadorInternet navegadorInternet = new NavegadorInternet();
//
//        reprodutorMusical.tocar();
//        reprodutorMusical.pausar();
//        reprodutorMusical.selecionarMusica(musica);
//        reprodutorMusical.pularMusica(musica);
//
//        String numero = sc.nextLine();
//
//        aparelhoTelefonico.ligar(numero);
//        aparelhoTelefonico.atender();
//        aparelhoTelefonico.iniciarCorreioVoz();
//
//        String url = sc.nextLine();
//        navegadorInternet.exibirPagina(url);
//        navegadorInternet.adicionarNovaAba();
//        navegadorInternet.atualizarPagina();
//
//
//        sc.close();
//    }
}

class ReprodutorMusical {

    void tocar() {
        System.out.println("Tocando musica");
    }

    void pausar() {
        System.out.println("Musica pausada");
    }

    void selecionarMusica(String musica) {
        System.out.println("Escolhendo a musica: " + musica);
    }

    void pularMusica(String musica) {
        System.out.println("Pulando a musica: " + musica);
    }

}

class AparelhoTelefonico {
    void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    void atender() {
        System.out.println("Atendendo numero");
    }
    void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}

class NavegadorInternet {
    void exibirPagina(String url) {
        System.out.println("Acessando site: https://" + url);
    }

    void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do navegador");
    }

    void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}
