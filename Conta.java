	
	interface Conta {
		double getSaldo();
		void deposita(double valor);
		void retira(double valor);
		void atualiza(double taxaSelic);
//				
//		protected double saldo;
//		
//		void deposita(double x) {
//			this.saldo += x;
//		}
//		
//		boolean retira(double x) {
//			if(this.saldo != 0){
//				this.saldo -= x;
//				return	true;
//			}				
//			else{
//				return false;
//			}	
//		}
//				
//		void setSaldo(double saldo) {
//			this.saldo += saldo;	
//		}
//		
//		double getSaldo() {
//			return this.saldo;	
//		}
//		
//		abstract void atualiza(double taxaSelic);
//		
//		private void pai(){
//			System.out.println("Sou o pai!");
//			
//			
//		}
	}