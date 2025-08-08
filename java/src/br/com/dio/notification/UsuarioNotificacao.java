package br.com.dio.notification;

public class UsuarioNotificacao implements Notificador {
    private String email;

    public UsuarioNotificacao(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("📧 " + email + " recebeu: " + mensagem);
    }
}