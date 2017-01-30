package Domain;

import javax.swing.JOptionPane;

public class Retangulo implements AreaCalculavel {
	
	private int largura, altura;
	
	public Retangulo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;	
	}
	
	public double calculaArea(){
		double area = largura * altura;
		return area;
	}
	
	public void showMsg(){
		JOptionPane.showMessageDialog(null, "O valor da área foi igual a " + calculaArea() + ".");
	}
	

}
