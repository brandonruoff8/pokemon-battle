package DefaultPokemon;
import java.awt.Color;

import java.util.Arrays;

public class TypeList {
	
	// Initialize 18 types
			Type none = new Type("NONE", Color.WHITE);
			Type normal = new Type("NORMAL", Color.LIGHT_GRAY);
			Type fire = new Type("FIRE", Color.RED);
			Type water = new Type("WATER", Color.BLUE);
			Type electric = new Type("ELECTRIC", Color.YELLOW);
			Type grass = new Type("GRASS", Color.GREEN);
			Type ice = new Type("ICE", Color.CYAN);
			Type fighting = new Type("FIGHTING", Color.RED);
			Type poison = new Type("POISON", Color.MAGENTA);
			Type ground = new Type("GROUND", Color.GRAY);
			Type flying = new Type("FLYING", Color.CYAN);
			Type psychic = new Type("PSYCHIC", Color.PINK);
			Type bug = new Type("BUG", Color.GREEN);
			Type rock = new Type("ROCK", Color.GRAY);
			Type ghost = new Type("GHOST", Color.MAGENTA);
			Type dragon = new Type("DRAGON", Color.BLUE);
			Type dark = new Type("DARK", Color.BLACK);
			Type steel = new Type("STEEL", Color.GRAY);
			Type fairy = new Type("FAIRY", Color.PINK);
			
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
