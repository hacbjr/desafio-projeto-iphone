import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("O aparelho está fazendo uma ligação.");
    }

    @Override
    public void atender(String numero) {
        System.out.println("O aparelho está atendendo uma ligação.");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("O aparelho está iniciando o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("O aparelho está abrindo o navegador.");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando uma nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página está sendo atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("O aparelho está tocando a música escolhida.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar a música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione uma música.");
    }
}
