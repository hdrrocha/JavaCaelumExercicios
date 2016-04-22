import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArraysListHashSet {

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
		// TODO Auto-generated method stub
		Collection<Integer> arrayList  = new HashSet<Integer>();

		long tempoInicial = System.currentTimeMillis();
		for(int i=0; i < 1000; i++){
			arrayList.add(i);		
		}
		for(int i=0; i < 1000; i++){
			arrayList.contains(i);	
			System.out.println(arrayList.contains(i));
		}
		
		 long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
		
	}

}
