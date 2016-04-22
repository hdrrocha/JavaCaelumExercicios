import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Banco {	
	public static void main(String[] args){
//		   Set<Conta> conta = new HashSet<>();
		   ArrayList<Conta> conta  = new ArrayList<Conta>();
	        conta.add(new Conta(1, "Jurandir"));
	        conta.add(new Conta(2, "Maneka"));
	        conta.add(new Conta(3, "Bob Esponja"));
	        conta.add(new Conta(4, "Caracol"));

//	        //em algum ponto do programa que você não possui mais
//	        //a variável de referência para o objeto que você quer
//	        //encontrar na lista
//	      //  Conta c = new Conta(4, "Caracol");
//	        Conta c = new Conta(4, "");
//	        System.out.println(conta.contains(c));
	        
	        //em algum ponto do programa que você não possui mais
	        //a variável de referência para o objeto que você quer
	        //encontrar na lista
	      //  Conta c = new Conta(4, "Caracol");
	        Conta c = new Conta(4, "Caracol");
	        System.out.println(conta.contains(c));
	        
		
		
	}


}
