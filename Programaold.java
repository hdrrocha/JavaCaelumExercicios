import java.util.*;
import java.util.Arrays;
import java.util.List;


public class Programa {
	
	public static void main (String[] args) {
		
		Banco banco = new Banco(10);
		/*	
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		*/
		
		banco.conta[0] = new Conta();
		banco.conta[1] = new ContaCorrente();
		banco.conta[2] = new ContaPoupanca();
		
		
		banco.conta[0].deposita(1000);
		banco.conta[1].deposita(1000);
		banco.conta[2].deposita(1000);
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(banco.conta[0]);
		adc.roda(banco.conta[1]);
		adc.roda(banco.conta[2]); 
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
	
	}	
	
	static class Conta {
				
		protected double saldo;
		
		void deposita(double x) {
			this.saldo += x;
		}
		
		boolean retira(double x) {
			if(this.saldo != 0){
				this.saldo -= x;
				return	true;
			}				
			else{
				return false;
			}	
		}
				
		void setSaldo(double saldo) {
			this.saldo += saldo;	
		}
		
		double getSaldo() {
			return this.saldo;	
		}
		
		void atualiza(double taxaSelic) {
			this.saldo = this.saldo * (1 + taxaSelic);
		}
		
		private void pai(){
			System.out.println("Sou o pai!");
		}
	}
	
	static class ContaCorrente extends Conta{
		void atualiza(double taxaSelic) {
			this.saldo = this.saldo * (2 * taxaSelic);
		}
		
	}	
	
	static class ContaPoupanca extends Conta{
		void atualiza(double taxaSelic) {
			this.saldo = this.saldo * (0.75 * taxaSelic);
		}
		
	}
	
	static class AtualizadorDeContas extends Conta{
		private double saldoTotal = 0;
		private double selic;
		
		AtualizadorDeContas(double selic) {
			this.selic = selic;
		}
		void roda(Conta c) {
		// aqui voce imprime o saldo anterior, atualiza a conta,
		System.out.println("Saldo anterior: "+ c.getSaldo());
		// e depois imprime o saldo final
		super.atualiza(this.selic);
		System.out.println("Saldo final: "+ c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		setSaldoTotal(c.getSaldo());
		
		}
		// outros métodos
		
		public double getSaldoTotal(){
		return this.saldoTotal;
		}
		public void setSaldoTotal(double valor){
			this.saldoTotal += valor;
		}
	}
	
	
	public static class Banco{
		Conta[] conta; 
		
		Banco(int tam){
			conta = new Conta[tam];
		}
	}
}