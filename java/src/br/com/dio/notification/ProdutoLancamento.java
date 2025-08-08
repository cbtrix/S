package br.com.dio.notification;

import java.util.ArrayList;
import java.util.List;

public class ProdutoLancamento {
    private List<Notificador> observadores;
    private String nomeUltimoProduto;

    public ProdutoLancamento() {
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Notificador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Notificador observador) {
        observadores.remove(observador);
    }

    public void lancarNovoProduto(String nomeProduto) {
        this.nomeUltimoProduto = nomeProduto;
        System.out.println("📢 Novo produto lançado: " + nomeProduto);
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Notificador observador : observadores) {
            observador.notificar(nomeUltimoProduto);
        }
    }
}