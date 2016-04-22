import java.util.*;

public class Bancos {
	protected Conta[] contas;
	public Bancos(int valor){
		this.contas = new Conta[valor];
	}
	
	public void adiciona(Conta c){
		for(int i = 0; i < contas.length; i++){
			if(contas[i] == null){
				this.contas[i]=c;
			}
			
		}
		
	}
	
	public int pegaTotalDeContas(){
		int totalContas = 0 ;
		for(int i = 0; i < contas.length; i++){
			if(contas[i]!= null){
				totalContas++;
			}
			
		}
		return totalContas;
	}
}
