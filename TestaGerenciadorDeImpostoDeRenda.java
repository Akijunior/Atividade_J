package App;

import Domain.ContaCorrente;
import Domain.ContaPoupanca;
import Domain.GerenciadorDeImpostoDeRenda;
import Domain.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda GDIDR = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida GA = new SeguroDeVida();
		GDIDR.adiciona(GA);
		
		ContaCorrente cc = new ContaCorrente();
		GDIDR.adiciona(cc);
		
		ContaPoupanca cp = new ContaPoupanca();
		GDIDR.adiciona(cp);
		
		GDIDR.getTotal();
	}

}
