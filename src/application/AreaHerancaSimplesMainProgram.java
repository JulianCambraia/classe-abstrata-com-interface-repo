package application;

import model.entities.Circulo;
import model.entities.FiguraAbstrata;
import model.entities.Retangulo;
import model.entities.enums.ColorEnum;

public class AreaHerancaSimplesMainProgram {

	public static void main(String[] args) {
		FiguraAbstrata retangulo = new Retangulo(ColorEnum.BLACK, 3.0, 4.0);
		FiguraAbstrata circulo = new Circulo(ColorEnum.WHITE, 2.0);
		System.out.println("Cor Circulo: " + circulo.getColorEnum());
		System.out.printf("Área do Circulo: %.2f%n ", circulo.area());
		System.out.println("Cor Retângulo: " + retangulo.getColorEnum());
		System.out.printf("Área Retângulo: %.2f%n", retangulo.area());
	}

}
