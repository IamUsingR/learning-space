package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestaConta {
public static void main(String[] args) {
	Conta conta = new Conta();  
	
	conta.deposita(50.0);
	
	if (conta.saca(30.0)) {
		System.out.println("Sacou");
	}
	System.out.println("O saldo é: " + conta.getSaldo());
}	
}
