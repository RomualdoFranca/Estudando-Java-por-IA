package packages.IoCandID.licao01;

public class Notificador {

	private ServicoEmail email;

	public Notificador(ServicoEmail email) {
		this.email = email;
	}

	public void enviarNotificacao() {
		email.enviar();
	}
}
