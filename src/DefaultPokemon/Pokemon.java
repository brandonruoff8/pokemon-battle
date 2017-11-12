package DefaultPokemon;

public class Pokemon {
	
	private String name;
	private Type type1;
	private Type type2;
	private final int level = 50;
	private int stats[] = new int[6];
	private int currentHP;
	private Move moves[] = new Move[4];
	
	public Pokemon(){
		name = "NoName";
		type1 = new Type();
		type2 = new Type();
		}
	
	public Pokemon(String tempName,
			Type tempType1,
			Type tempType2,
			int hpStat,
			int attackStat,
			int defenseStat,
			int spAtkStat,
			int spDefStat,
			int speedStat,
			Move move1,
			Move move2,
			Move move3,
			Move move4) {
		
			name = tempName;
			type1 = tempType1;
			type2 = tempType2;
			stats[0] = hpStat;
			stats[1] = attackStat;
			stats[2] = defenseStat;
			stats[3] = spAtkStat;
			stats[4] = spDefStat;
			stats[5] = speedStat;
			currentHP = stats[0];
			moves[0] = move1;
			moves[1] = move2;
			moves[2] = move3;
			moves[3] = move4;
			}
	
	public String getName() {
		return name;
	}
	
	public void changeName(String tempName) {
		name = tempName;
	}
	
	public Type getType1() {
		return type1;
	}
	
	public Type getType2() {
		return type2;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public int getHP() {
		return stats[0];
	}
	
	public int getAttack() {
		return stats[1];
	}
	
	public int getDefense() {
		return stats[2];
	}
	
	public int getSpAtk() {
		return stats[3];
	}
	
	public int getSpDef() {
		return stats[4];
	}
	
	public int getSpeed() {
		return stats[5];
	}
	
	public Move[] getMoves() {
		return moves;
	}
}
