public class /*nome da classe*/ContaCorrente {

	//lista de atributos da classe
	int agencia;
	int nConta;
	double saldo;
	Cliente cliente;
	
	
	// metodo que realiza um saque, e retorna true se o saque foi realizado
	// ou retorna false se o saque n�o foi realizado
	// retorno: retorna se o saque foi realizado com sucesso ou n�o
	// parametro valor: valor a ser sacado
	boolean sacar(double valor) {
		
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	// metodo que realiza um cr�dito na conta corrente
	// retorno: vazio
	// parametro valor: valor a ser creditado
	void creditar(double valor) {
	
		saldo = saldo + valor;
	
	}
	
	// retorna o saldo atual da conta corrente
	// retorno: saldo atual da conta
	// n�o recebe parametros
	double saldoAtual() {
		return saldo;
	}
	
}