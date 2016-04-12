 class AtualizadorDeContas extends Conta{
		private double saldoTotal = 0;
		private double selic;
		
		AtualizadorDeContas(double selic) {
			this.selic = selic;
		}
		void roda(Conta c) {
		// aqui voce imprime o saldo anterior, atualiza a conta,
		System.out.println("Saldo anterior: "+ c.getSaldo());
		// e depois imprime o saldo final
		//super.atualiza(this.selic);
		System.out.println("Saldo final: "+ c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		setSaldoTotal(c.getSaldo());
		
		}
		// outros métodos
		
		public double getSaldoTotal(){
		return this.saldoTotal;
		}
		public void setSaldoTotal(double valor){
			this.saldoTotal += valor;
		}
		@Override
		void atualiza(double taxaSelic) {
			// TODO Auto-generated method stub
			
		}
	}