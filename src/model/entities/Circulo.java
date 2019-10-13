package model.entities;

import model.entities.enums.ColorEnum;

public class Circulo extends FiguraAbstrata {

	private Double raio;

	public Circulo(ColorEnum color, Double raio) {
		super(color);
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}

}
