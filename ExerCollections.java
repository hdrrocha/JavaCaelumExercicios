import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ExerCollections {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//
//		long tempoInicial = System.currentTimeMillis();
//		for(int i=0; i < 1000; i++){
//			arrayList.add(i);		
//		}
//		for(int i=0; i < 1000; i++){
//			arrayList.contains(i);	
//			System.out.println(arrayList.contains(i));
//		}
//		
//		 long tempoFinal = System.currentTimeMillis();
//		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
//		
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashSet<Integer> arrayList = new HashSet<Integer>();
//
//		long tempoInicial = System.currentTimeMillis();
//		for(int i=0; i < 1000; i++){
//			arrayList.add(i);		
//		}
//		for(int i=0; i < 1000; i++){
//			arrayList.contains(i);	
//			System.out.println(arrayList.contains(i));
//		}
//		
//		 long tempoFinal = System.currentTimeMillis();
//		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
//		
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Collection<Integer> arrayList = new ArrayList<Integer>();
//
//		long tempoInicial = System.currentTimeMillis();
//		for(int i=0; i < 1000; i++){
//			arrayList.add(i);		
//		}
//		for(int i=0; i < 1000; i++){
//			arrayList.contains(i);	
//			System.out.println(arrayList.contains(i));
//		}
//		
//		 long tempoFinal = System.currentTimeMillis();
//		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
//		
//	}
	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new Conta();
		c1.deposita(150);
		contas.add(c1);
		
		Conta c2 = new Conta();
		c2.deposita(100);
		contas.add(c2);
		
		Conta c3 = new Conta();
		c3.deposita(200);
		contas.add(c3);
		ExerCollections.sort(contas);
		
		
		System.out.println(contas);
		
	}

}
