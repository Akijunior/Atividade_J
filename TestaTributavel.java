package App;

import Domain.ContaCorrente;
import Domain.ContaPoupanca;
import Domain.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		// 2 - System.out.println("O valor do getSaldo de t é igual a " + t.getSaldo());
		// Devido a t ser do tipo Tributavel, ainda que aponte para cc, ele não é do mesmo tipo. 
		
	}

}
