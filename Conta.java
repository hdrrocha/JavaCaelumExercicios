	
	 class  Conta{

				
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
		

		private void pai(){
			System.out.println("Sou o pai!");
			
			
		}

	
	}