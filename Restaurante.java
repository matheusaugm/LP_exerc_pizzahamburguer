import javax.swing.*;

public class Restaurante {
	public static void main(String[] args) {

		int opcao=Integer.parseInt(JOptionPane.showInputDialog("Informe o pedido:\n1. Hamburguer\n 2. Pizza \n3. Sair"));
		switch(opcao){
			case 1:
				String nomeHamburguer = JOptionPane.showInputDialog("Digite o nome do Hamburguer: ");
				double valorHamburguer = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do hamburguer: "));
				boolean controladorHArtesanal = Boolean.parseBoolean(JOptionPane.showInputDialog("Eh artesanal? \ntrue- sim false- nao"));

//	tentei fazer com if else e falhei miseravelmente
// 				String controladorHArtesanal = JOptionPane.showInputDialog("Eh artesanal? true- sim false- nao");
//				controladorHArtesanal.toUpperCase();
//				boolean eArtesanal;
//				if (controladorHArtesanal=="S"){
//					eArtesanal = true;
//				}
//				else {
//					eArtesanal = false;
//				}
				Hamburguer hamburguer = new Hamburguer(nomeHamburguer,valorHamburguer,controladorHArtesanal);
				double valorFinalHamb = hamburguer.calculaValorHamburguer(valorHamburguer, controladorHArtesanal);
				JOptionPane.showMessageDialog(null,"O hamburguer "+nomeHamburguer+" custou: "+valorFinalHamb);
				break;
			case 2:
				String nomePizza = JOptionPane.showInputDialog("Digite o nome da pizza");
				double valorPizza = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza"));
				boolean temBorda = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem borda? \ntrue- sim false- nao"));
// Tentei fazer com if else e falhei miseravelmente hehe
// String temBorda = JOptionPane.showInputDialog("Tem borda? true- sim false- nao");
//				temBorda.toUpperCase();
//				boolean controladorTemBorda;
//				if (temBorda =="S"){
//					controladorTemBorda = true;
//				}
//				else {
//					controladorTemBorda = false;
//				}
				Pizza pizza = new Pizza(nomePizza, valorPizza, temBorda);
				double valorFinalPizza = pizza.calcula(valorPizza,temBorda);
				JOptionPane.showMessageDialog(null, "O valor da pizza "+nomePizza +" foi: " +valorFinalPizza);
				break;
			case 3:
				break;

		}
	}
}
