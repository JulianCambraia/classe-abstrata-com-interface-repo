package model.entities;

import model.entities.enums.ColorEnum;

public class Retangulo extends Figura {

	private Double largura;
	private Double altura;

	public Retangulo() {
		super();
	}

	public Retangulo(ColorEnum color, Double largura, Double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.largura * this.altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
