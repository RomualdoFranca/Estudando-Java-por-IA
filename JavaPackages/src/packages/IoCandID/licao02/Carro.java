package packages.IoCandID.licao02;

public class Carro {
	
	private Motor motor;

	public Carro(Motor motor) {
		this.motor = motor;
	}

	public void ligarMotor() {
		motor.ligar();
	}
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	

}
