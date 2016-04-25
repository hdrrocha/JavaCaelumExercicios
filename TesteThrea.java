
public class TesteThread {

	public static void main(String[] args) throws InterruptedException {
		// //Bolinhas brancas
		// for (int i = 0; i < 10; i++) {
		// System.out.println("BRANCA");
		// Thread.sleep(1000); //Para demorar um segundo ate a proxima bolinha
		// }
		// Bolinhas pretas
//		for (int i = 0; i < 10; i++) {
//			System.out.println("PRETA");
//			Thread.sleep(1000); // Para demorar um segundo ate a proxima bolinha
//		}

		//1° Crias as Runables
		Runnable bolinhasBrancas = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// Bolinhas brancas
				for (int i = 0; i < 1001; i++) {
					try {
						System.out.println("BRANCA");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated e.printStackTrace();
						System.out.println("A Thread sofreu uma interrupcao!");
					} // Para demorar um segundo ate a proxima bolinha
				}

			}
		};
		
		
		Runnable bolinhasPretas = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// Bolinhas brancas
				for (int i = 0; i < 1001; i++) {
					try {
						System.out.println("PRETA");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("A Thread sofreu uma interrupcao!");
					} // Para demorar um segundo ate a proxima bolinha
				}

			}
		};
		
		//2° Agendar as Threads para que as Runables rodem 		
		Thread thBolinhasBrancas = new Thread(bolinhasBrancas);
		Thread thBolinhasPretas = new Thread(bolinhasPretas);
		
		//3° Rodar as Threads
		thBolinhasBrancas.start();
		thBolinhasPretas.start();
	}
}
