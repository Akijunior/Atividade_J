package Domain;

public class GerenciadorDeImpostoDeRenda {
	
	private double total = 0;
	
	public void adiciona(Tributavel t){
		System.out.println("Adiciona Tributável: " + t.calculaTributos());
		
		this.total += t.calculaTributos();
	}
	
	public void getTotal(){
		System.out.printf("O saldo é: %.2f.", this.total);
	}

}
