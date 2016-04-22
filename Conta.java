
class Conta {
	protected double saldo;
	private int idConta;
	private String nomeConta;

	public Conta(int idConta, String nomeConta) {
		super();
		this.idConta = idConta;
		this.nomeConta = nomeConta;
	}

	// getters and setters aqui!

	void setIdConta(double idConta) {
		this.idConta += idConta;
	}

	int getIdConta() {
		return this.idConta;
	}

	void setNomeConta(double nomeConta) {
		this.nomeConta += nomeConta;
	}

	String getNomeConta() {
		return this.nomeConta;
	}

	@Override
	public int hashCode() {
		// deve ser o mesmo resultado para um mesmo objeto, n�o pode ser
		// aleat�rio
		return this.idConta;
	}

	@Override
	public boolean equals(Object obj) {
		// se nao forem objetos da mesma classe sao objetos diferentes
		if (!(obj instanceof Conta))
			return false;

		// se forem o mesmo objeto, retorna true
		if (obj == this)
			return true;

		// aqui o cast � seguro por causa do teste feito acima
		Conta conta = (Conta) obj;

		// aqui voc� compara a seu gosto, o ideal � comparar atributo por
		// atributo
		return this.idConta == conta.getIdConta() && this.nomeConta.equals(conta.getNomeConta()); 	
	}

	void deposita(double x) {
		this.saldo += x;
	}

	void retira(double x) {

		try {
			if (this.saldo > x) {
				this.saldo -= x;
				System.out.println("Sacou: " + x);
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println(e = new SaldoInsuficienteException());
		}

	}

	void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	double getSaldo() {
		return this.saldo;
	}

	private void pai() {
		System.out.println("Sou o pai!");

	}

	public char[] contains(Conta c) {
		// TODO Auto-generated method stub
		return null;
	}

}