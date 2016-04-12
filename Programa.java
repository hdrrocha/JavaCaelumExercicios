
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Conta conta = new Conta();
		ContaCorrente contaCorrente = new ContaCorrente() {
			
			@Override
			public double calculaTributos(double taxa) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			void atualiza(double taxaSelic) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
