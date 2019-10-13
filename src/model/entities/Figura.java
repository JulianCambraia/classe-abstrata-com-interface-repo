package model.entities;

import model.entities.enums.ColorEnum;

public abstract class Figura {
	
	private ColorEnum colorEnum;

	public Figura() {
		super();
	}

	public Figura(ColorEnum colorEnum) {
		super();
		this.colorEnum = colorEnum;
	}
	
	public ColorEnum getColorEnum() {
		return colorEnum;
	}

	public void setColorEnum(ColorEnum colorEnum) {
		this.colorEnum = colorEnum;
	}

	public abstract Double area();

}
