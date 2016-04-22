import java.util.*;
import java.util.Arrays;
import java.util.List;


public class Programa {
	
	public static void main (String[] args) {
		
		Empresa empresa1 = new Empresa(10);
	//	empresa1.funcionarios = new Funcionario[10];
		
		empresa1.funcionarios[1] = new Funcionario("Bertan", "TI", 8000);  
		empresa1.adiciona(empresa1.funcionarios[0] );	
		empresa1.mostra();
				
		empresa1.contem(empresa1.funcionarios[1]);  
		
		
	}

	public static class Empresa {
	    private int cnpj;        
		public static int i = 0;        
		private Funcionario[] funcionarios;    

		Empresa(int tam){
			funcionarios = new Funcionario[tam];
		}
		
		public void adiciona(Funcionario f){
			if(i > 10)
				System.out.println("Sem espaco livre no array!");		
			else
				this.funcionarios[i] = f;                                 
                this.funcionarios[i].setIdentificador(this.i);
                this.i++;                                   			
				
		}
		
		public void mostra(){
			for(Funcionario x : this.funcionarios){
				 System.out.println(x!= null ? x.nome : "");
			}
		}	

		public boolean contem(Funcionario f) {
			for(Funcionario x : this.funcionarios){				
				if(x == f){
					System.out.println("O funcionario trabalha conosco");
					return true;				
				}				
			}
			System.out.println("O funcionario não trabalha conosco");
			return false;		
		}

		public Funcionario getFuncionario(int posicao) {
			return this.funcionarios[posicao];
		}		
	}

	
	public static class Funcionario{
		private String nome;
		private String funcao;
		private int salario;
		int identificador;
		
		public Funcionario(String nome, String funcao, int salario)
		{
			this.funcao = funcao;
			this.nome = nome;
			this.salario = salario;
			
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public String getNome(){
			return this.nome;			
		}
		
		public void setFuncao(String funcao){
			this.funcao = funcao;
		}
		
		public String getFuncao(){
			return this.funcao;			
		}
		
		public void setSalario(int salario){
			this.salario = salario;
		}
		
		public int getSalario(){
			return this.salario;			
		}
				
		public void setIdentificador(int identificador){
			this.identificador = identificador;
		}
		
		public int getIdentificador(){
			return this.identificador;			
		}
	}	
	
}
