package br.com.dio.notification;

public class Main {
    public static void main(String[] args) {
        ProdutoLancamento lancamento = new ProdutoLancamento();

        UsuarioNotificacao usuario1 = new UsuarioNotificacao("ana@email.com");
        UsuarioNotificacao usuario2 = new UsuarioNotificacao("pedro@email.com");
        UsuarioNotificacao usuario3 = new UsuarioNotificacao("carla@email.com");

        lancamento.adicionarObservador(usuario1);
        lancamento.adicionarObservador(usuario2);
        lancamento.adicionarObservador(usuario3);

        lancamento.lancarNovoProduto("Smartphone X10");

        lancamento.removerObservador(usuario2);

        lancamento.lancarNovoProduto("Fone Bluetooth Pro");


    }
}