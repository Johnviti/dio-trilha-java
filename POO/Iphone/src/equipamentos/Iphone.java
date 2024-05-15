package equipamentos;
import equipamentos.Musica;
import equipamentos.NavegadorInternet;
import equipamentos.Telefone;


public class Iphone implements Musica, NavegadorInternet, Telefone {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar() {
        System.out.println("Ligando telefone");
    }

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
