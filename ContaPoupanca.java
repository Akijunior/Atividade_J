package Domain;

public class ContaPoupanca extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
	    this.saldo += this.saldo * taxa * 3;
	  }
	
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo();
	}

}
