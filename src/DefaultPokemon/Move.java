package DefaultPokemon;

public class Move {
	String name;
	double power;
	double accuracy;
	Type type;
	String category;
	double priority;
	
	public Move(){
		name = "NONE";
		type = new Type();
		power = 0.0;
		accuracy = 100.0;
		category = "NONE";
		priority = 0;
	}
	
	public Move(String tempName, Type tempType, double tempPower, double tempAccuracy, String tempCategory, int tempPriority){
		name = tempName;
		type = tempType;
		power = tempPower;
		accuracy = tempAccuracy;
		category = tempCategory;
		priority = tempPriority;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPower(){
		return power;
	}
	
	public double getAccuracy(){
		return accuracy;
	}
	
	public Type getType(){
		return type;
	}
	
	public String getPurpose(){
		return category;
	}
	
	public void specialEffect() {
		
	}
}
