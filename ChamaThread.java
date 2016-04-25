
public class ChamaThread {

	public boolean fim = false;

	public static void main(String[] args) throws InterruptedException {

	

		Runnable bolinhasPretas = new Runnable() {

			@Override
			public void run() {
			
				// 1° Crias as Runables
				Runnable bolinhasBrancas = new Runnable() {

					@Override
					public void run() {
						// Bolinhas brancas
						for (int i = 0; i < 100; i++) {
							try {
								System.out.println("BRANCA" + i);
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("A Thread sofreu uma interrupcao!");
							} // Para demorar um segundo ate a proxima bolinha
						}

						for (int i = 100; i > 0; i--) {
							try {
								System.out.println("BRANCA" + i);
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("A Thread sofreu uma interrupcao!");
							} // Para demorar um segundo ate a proxima bolinha
						}

					}
				};
				Thread thBolinhasBrancas = new Thread(bolinhasBrancas);
				thBolinhasBrancas.start();
				// Bolinhas brancas
				int count = 0;
				
				while (count != 5) {
					try {
						count++;
						System.out.println("PRETA" + count);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("A Thread sofreu uma interrupcao!");
					} // Para demorar um segundo ate a proxima bolinha

				}
				if(count == 5){
					thBolinhasBrancas.currentThread().interrupt();
				}

			}
		};
	

		// 2° Agendar as Threads para que as Runables rodem
		//Thread thBolinhasBrancas = new Thread(bolinhasBrancas);
		Thread thBolinhasPretas = new Thread(bolinhasPretas);

		// 3° Rodar as Threads
		//thBolinhasBrancas.start();
		thBolinhasPretas.start();

	}
}
