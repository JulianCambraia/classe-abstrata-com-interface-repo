package model.entities;

import model.entities.enums.ColorEnum;

/**
 * Tornei a classe Abstrata para poder delegar a implementação da area() para a próxima classe concreta.
 * Delega a implementação area do contrato para a próxima classe concreta
 * @author julian
 *
 */
public abstract class FiguraAbstrata implements Figura {

	private ColorEnum colorEnum;

	public FiguraAbstrata(ColorEnum colorEnum) {
		super();
		this.colorEnum = colorEnum;
	}

	public ColorEnum getColorEnum() {
		return colorEnum;
	}

	public void setColorEnum(ColorEnum colorEnum) {
		this.colorEnum = colorEnum;
	}

}
