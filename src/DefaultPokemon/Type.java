package DefaultPokemon;
import java.awt.Color;

public class Type {
	String name;
	Color color;
	
	public Type() {
		
	}
	
	public Type(String tempName, Color tempColor) {
		name = tempName;
		color = tempColor;
	}
	
	public String getName() {
		return name;
	}
	
	public Color getColor() {
		return color;
	}
}