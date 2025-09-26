package packages.IoCandID.licao02;

public class Application {

	public static void main(String[] args) {

//		Carro carroGasolina = new Carro(new MotorGasolina());
//		carroGasolina.getMotor().ligar();
		
		Carro carroGasolina = new Carro(new MotorGasolina());
		carroGasolina.ligarMotor();
		
		Carro carroEletrico = new Carro(new MotorEletrico());
		carroEletrico.getMotor().ligar();
	}

}
