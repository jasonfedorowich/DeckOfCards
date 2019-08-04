package suits;

import color.Color;

public class Spades extends Suit{

	private String name;
	private Color color;

	public Spades(){
		this.name = "Clubs";
		this.color = Color.BLACK;
	}
	
	
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
