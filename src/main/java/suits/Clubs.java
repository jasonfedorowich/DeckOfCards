package suits;

import color.Color;

public class Clubs extends Suit{
	
	private String name;
	private Color color;

	public Clubs(){
		this.name = "Clubs";
		this.color = Color.BLACK;
	}
	
	
	@Override
	public Color getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
