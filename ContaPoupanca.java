	 class ContaPoupanca extends Conta{
		private double saldo;

		public void atualiza(double taxaSelic) {
			this.saldo = this.getSaldo() * (0.75 * taxaSelic);
		}

		@Override
		public double getSaldo() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deposita(double valor) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void retira(double valor) {
			// TODO Auto-generated method stub
			
		}
		
	}