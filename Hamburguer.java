public class Hamburguer {
	String nome;
	double valor;
	boolean artesanal;

	public Hamburguer(String nome, double valor, boolean artesanal) {
		this.nome = nome;
		this.valor = valor;
		this.artesanal = artesanal;
	}

	double calculaValorHamburguer(double valorHamburguer, boolean eArtesanal){

		if(eArtesanal){
			return valorHamburguer +8;
		}
		else {
			return valorHamburguer;
		}

	}
}
