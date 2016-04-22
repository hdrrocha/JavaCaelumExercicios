import java.lang.reflect.Array;

public class Banco {	
	public static void main(String[] args){
		Bancos banco;
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		banco = new Bancos(3);
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		banco.adiciona(c);
		banco.adiciona(cc);
		banco.adiciona(cp);
		
		System.out.println(banco.pegaTotalDeContas());
		
	}


}
