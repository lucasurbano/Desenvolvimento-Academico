import javax.swing.JOptionPane;

public class Aplicacao {



	public static void main (String []args) {
		
		// cria um cliente
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Cleyton";
		cliente1.idade = 29;
		cliente1.cpf = "000.000.000-11";
		
		// cria um cliente
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Joselardisson";
		cliente2.idade = 16;
		cliente2.cpf = "000.000.001-21";
		
		// criar uma conta corrente
		ContaCorrente conta1 = new ContaCorrente();
		conta1.agencia = 12;
		conta1.nConta = 89;
		conta1.saldo = 20.98;
		conta1.cliente = cliente1;
		
		// criar uma conta corrente
		ContaCorrente conta2 = new ContaCorrente();
		conta2.agencia = 12;
		conta2.nConta = 45;
		conta2.saldo = 120.68;
		conta2.cliente = cliente2;
		
		// realiza um credito de 10
		conta1.creditar(10);
		
		//realiza um debito de 100
		boolean saque = conta1.sacar(1);
		if (saque) {
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");			
		} else {
			JOptionPane.showMessageDialog(null, "O Saldo da conta é insuficiente");
		}
		
		// pega o saldo atual da conta
		double saldo = conta1.saldoAtual();
		
		////
		
		// realiza um credito de 1000
		conta2.creditar(56.98);
		
		//realiza um debito de 100
		conta2.sacar(1200.87);
		
		// pega o saldo atual da conta
		saldo = conta2.saldoAtual();
		
		
	}
}
