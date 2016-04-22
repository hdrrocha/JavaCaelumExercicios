	
	 class  Conta<T> implements Comparable<T>{
//		double getSaldo();
//		void deposita(double valor);
//		void retira(double valor);
//		void atualiza(double taxaSelic);
				
		protected double saldo;
		
		void deposita(double x) {
			this.saldo += x;
		}
		
		void retira(double x) {

				try {			
					if (this.saldo > x){					
						this.saldo -= x;
					System.out.println("Sacou: " +x);
					}
				} catch (SaldoInsuficienteException e) {
					System.out.println(e =  new SaldoInsuficienteException());	
				}
			
			
		}
		
				
		void setSaldo(double saldo) {
			this.saldo += saldo;	
		}
		
		double getSaldo() {
			return this.saldo;	
		}
		
//		abstract void atualiza(double taxaSelic);
		
		private void pai(){
			System.out.println("Sou o pai!");
			
			
		}

		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}