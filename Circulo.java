package Domain;

import javax.swing.JOptionPane;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	public void showMsg(){
		JOptionPane.showMessageDialog(null, "O valor da área foi igual a " + calculaArea() + ".");
	}
	
	

}
