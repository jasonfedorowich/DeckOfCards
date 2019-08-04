package suits;

import color.Color;

public class Diamonds extends Suit{

	
	private String name;
	private Color color;
	
	public Diamonds(){
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
