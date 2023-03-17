public class Pizza {
	String nome;
	double valor;
	boolean borda;

	public Pizza(String nome, double valor, boolean borda) {
		this.nome = nome;
		this.valor = valor;
		this.borda = borda;
	}

	double calcula(double pizzaValor, boolean borda){
		double valor;

		if(borda == true){
			valor = pizzaValor +5.0;
			return valor;
		} else{
			valor = pizzaValor;
			return valor;

		}

	};

	String nomePizza(String pizza){

		return this.nome;

	}
}
