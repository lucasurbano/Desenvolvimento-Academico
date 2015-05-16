import javax.swing.JOptionPane;

public class Aplicacao {



	public static void main (String []args) {
		
		// cria um cliente
		// Cliente 1 
		Cliente cliente1 = new Cliente();
		cliente1.nome = JOptionPane.showInputDialog ("Informe o nome do Cliente 1 : ");
		cliente1.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do Cliente : "+cliente1.nome));
		cliente1.cpf = JOptionPane.showInputDialog ("Informe o CPF do Cliente : "+cliente1.nome);

		// cria um cliente
		// Cliente 2
		Cliente cliente2 = new Cliente();
		cliente2.nome = JOptionPane.showInputDialog ("Informe o nome do Cliente 2 : ");
		cliente2.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do Cliente : "+cliente2.nome));
		cliente2.cpf = JOptionPane.showInputDialog ("Informe o CPF do Cliente : "+cliente2.nome);
		
		// criar uma conta corrente
		// Cliente 1 
		ContaCorrente conta1 = new ContaCorrente();
		conta1.agencia = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe a Agencia do cliente: "+cliente1.nome));
		conta1.nConta = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe o numero da conta corrente do "+cliente1.nome));
		conta1.saldo =  Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o saldo da conta corrente do "+cliente1.nome));
		conta1.cliente = cliente1;
		
		// criar uma conta corrente
		// Cliente 2 
		ContaCorrente conta2 = new ContaCorrente();
		conta2.agencia = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe a Agencia do cliente: "+cliente2.nome));
		conta2.nConta = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe o numero da conta corrente do "+cliente2.nome));
		conta2.saldo =  Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o saldo da conta corrente do "+cliente2.nome));
		conta2.cliente = cliente2;
		
		// realiza um credito com valor informado pelo operador
		conta1.creditar(Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o valor de deposito do cliente "+cliente1.nome)));
		conta2.creditar(Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o valor de deposito do cliente "+cliente2.nome)));
		
		//realiza um debito de  com o valor informado pelo operador

		//Cliente 1	
		boolean saque = conta1.sacar(Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o valor de saque do cliente "+cliente1.nome)));
		if (saque) {
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");			
		} else {
			JOptionPane.showMessageDialog(null, "O Saldo da conta eh insuficiente");
		};

		//Cliente 2	
		saque = conta2.sacar(Double.parseDouble (JOptionPane.showInputDialog(null,"Informe o valor de saque do cliente "+cliente2.nome)));
		if (saque) {
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");			
		} else {
			JOptionPane.showMessageDialog(null, "O Saldo da conta eh insuficiente");
		}

		
		// pega o saldo atual da conta
		Double saldo = conta1.saldoAtual();
		saldo = conta2.saldoAtual();

		//Imprimir todas as inforamções e suas alterações realizadas pelo operador

		//Cliente 1
		JOptionPane.showMessageDialog(null, "O Cliente "+cliente1.nome+"\nPossui a Agencia "+conta1.agencia+"\nPossui a Conta corrente "+conta1.nConta+"\nO seu saldo 			atual eh R$ "+conta1.saldo);
		
		//Cliente 2
		JOptionPane.showMessageDialog(null, "O Cliente "+cliente2.nome+"\nPossui a Agencia "+conta2.agencia+"\nPossui a Conta corrente "+conta2.nConta+"\nO seu saldo 			atual eh R$ "+conta2.saldo);

						
	}
}
