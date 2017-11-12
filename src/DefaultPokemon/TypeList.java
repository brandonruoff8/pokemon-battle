package DefaultPokemon;
import java.awt.Color;

import java.util.Arrays;

public class TypeList {
	
	Color DARK_BROWN = new Color(179, 117, 59);
	Color LIGHT_BROWN = new Color(207, 156, 107);
	Color BUG_GREEN = new Color(117, 179, 59);
	Color ICE_BLUE = new Color(163, 244, 244);
	Color LIGHT_PINK = new Color(181, 209, 237);
	Color HOT_PINK = new Color(212, 125, 171);
	Color VIOLET = new Color(128, 69, 194);
	Color BRICK_RED = new Color(140, 46, 46);
	Color BLUE_VIOLET = new Color(82, 59, 176);
	Color TAN = new Color(224, 207, 163);
	Color SKY = new Color (176, 163, 224);
	
	// Initialize 18 types
			Type none = new Type("NONE", Color.WHITE);
			Type normal = new Type("NORMAL", TAN);
			Type fire = new Type("FIRE", Color.RED);
			Type water = new Type("WATER", Color.BLUE);
			Type electric = new Type("ELECTRIC", Color.YELLOW);
			Type grass = new Type("GRASS", Color.GREEN);
			Type ice = new Type("ICE", Color.CYAN);
			Type fighting = new Type("FIGHTING", BRICK_RED);
			Type poison = new Type("POISON", Color.MAGENTA);
			Type ground = new Type("GROUND", LIGHT_BROWN);
			Type flying = new Type("FLYING", SKY);
			Type psychic = new Type("PSYCHIC", HOT_PINK);
			Type bug = new Type("BUG", BUG_GREEN);
			Type rock = new Type("ROCK", DARK_BROWN);
			Type ghost = new Type("GHOST", VIOLET);
			Type dragon = new Type("DRAGON", BLUE_VIOLET);
			Type dark = new Type("DARK", Color.BLACK);
			Type steel = new Type("STEEL", Color.GRAY);
			Type fairy = new Type("FAIRY", LIGHT_PINK);
			
			Type[] typeArray = {none, normal, fire, water, electric, grass, ice, fighting, poison, ground,
						flying, psychic, bug, rock, ghost, dragon, dark, steel, fairy};
			
			double[][] matchupArray = {
	//DEF// None, Nor, Fir, Wat, Ele, Grs, Ice, Fgt, Poi, Grd, Fly, Psy, Bug, Roc, Gho, Dgn, Dar, Ste, Fai //
	/**ATK*/				
	/**Non*/{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
	/**Nor*/{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 0.0, 1.0, 1.0, 0.5, 1.0},
	/**Fir*/{1.0, 1.0, 0.5, 0.5, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 2.0, 1.0},
	/**Wat*/{1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0},
	/**Ele*/{1.0, 1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0},
	/**Gra*/{1.0, 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 0.5, 1.0},
	/**Ice*/{1.0, 1.0, 0.5, 0.5, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0},
	/**Fgt*/{1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5, 0.5, 0.5, 2.0, 0.0, 1.0, 2.0, 2.0, 0.5},
	/**Poi*/{1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 0.0, 2.0},
	/**Grd*/{1.0, 1.0, 2.0, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0},
	/**Fly*/{1.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 0.5, 1.0},
	/**Psy*/{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 0.0, 0.5, 1.0},
	/**Bug*/{1.0, 1.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.5, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 0.5, 1.0, 2.0, 0.5, 0.5},
	/**Roc*/{1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0},
	/**Gho*/{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0},
	/**Dgn*/{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 0.0},
	/**Dar*/{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5},
	/**Ste*/{1.0, 1.0, 0.5, 0.5, 0.5, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 2.0},
	/**Fai*/{1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 0.5, 1.0}
			};
			
			public double checkMatchup(Type type1, Type type2){
				int attackIndex = Arrays.asList(typeArray).indexOf(type1);
				int defendIndex = Arrays.asList(typeArray).indexOf(type2);
				return (matchupArray[attackIndex][defendIndex]);
			}
			
			public double checkMatchup(Type type1, Type type2, Type type3){
				int attackIndex = Arrays.asList(typeArray).indexOf(type1);
				int defendIndex1 = Arrays.asList(typeArray).indexOf(type2);
				int defendIndex2 = Arrays.asList(typeArray).indexOf(type3);
				return (matchupArray[attackIndex][defendIndex1] * matchupArray[attackIndex][defendIndex2]);
			}
			
			public String checkEffective(Type type1, Type type2){
				int attackIndex = Arrays.asList(typeArray).indexOf(type1);
				int defendIndex = Arrays.asList(typeArray).indexOf(type2);
				double decimalMatchup = matchupArray[attackIndex][defendIndex];
				if (decimalMatchup == 0) {
					return("It had no effect.");
				}
				else if (decimalMatchup < 1) {
					return("It's not very effective.");
				}
				else if (decimalMatchup > 1) {
					return("It's super effective!");
				}
				else {
					return("Its effect was normal.");
				}
			}
			
			public String checkEffective(Type type1, Type type2, Type type3){
				int attackIndex = Arrays.asList(typeArray).indexOf(type1);
				int defendIndex1 = Arrays.asList(typeArray).indexOf(type2);
				int defendIndex2 = Arrays.asList(typeArray).indexOf(type3);
				double decimalMatchup = matchupArray[attackIndex][defendIndex1] * matchupArray[attackIndex][defendIndex2];
				if (decimalMatchup == 0) {
					return("It has no effect.");
				}
				else if (decimalMatchup < 1) {
					return("It's not very effective.");
				}
				else if (decimalMatchup > 1) {
					return("It's super effective!");
				}
				else {
					return("Its effect was normal.");
				}
			}

}
