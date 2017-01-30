package Domain;

import javax.swing.JOptionPane;

public class Quadrado implements AreaCalculavel{
	
	private int lado;
	public Quadrado(int lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		double area = this.lado * this.lado;
		return area;
	}
	
	public void showMsg(){
		JOptionPane.showMessageDialog(null, "O valor da �rea foi igual a " + calculaArea() + ".");
	}

}
