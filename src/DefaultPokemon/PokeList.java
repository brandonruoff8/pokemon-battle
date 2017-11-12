package DefaultPokemon;

public class PokeList {
	
		MoveList moveList = new MoveList();
		TypeList typeList = moveList.typeList;
	
		// Initialize Brandon's Pokemon
				Pokemon galvantula = new Pokemon(
					"Galvantula",
					typeList.bug,
					typeList.electric,
					70+75,
					77+20,
					60+20,
					97+20+32,
					60+20,
					108+20+32,
					moveList.thunder,
					moveList.bugBuzz,
					moveList.energyBall,
					moveList.hiddenPowerIce);
				
				Pokemon infernape = new Pokemon(
					"Infernape",
					typeList.fire,
					typeList.fighting,
					76+75,
					104+20+32,
					71+20,
					104+20,
					71+20,
					108+20+32,
					moveList.closeCombat,
					moveList.flareBlitz,
					moveList.thunderPunch,
					moveList.poisonJab);
				
				Pokemon klinklang = new Pokemon(
					"Klinklang",
					typeList.steel,
					typeList.none,
					60+75+32,
					100+20+32,
					115+20,
					70+20,
					85+20,
					90+20,
					moveList.gearGrind,
					moveList.wildCharge,
					moveList.re_turn,
					moveList.earthquake);
				
				Pokemon wishiwashi = new Pokemon(
					"Wishiwashi",
					typeList.water,
					typeList.none,
					45+75+32,
					140+20,
					130+20,
					140+20+32,
					135+20,
					40+20,
					moveList.hydroPump,
					moveList.iceBeam,
					moveList.earthquake,
					moveList.re_turn);
				
				Pokemon sylveon = new Pokemon(
					"Sylveon",
					typeList.fairy,
					typeList.none,
					95+75+32,
					65+20,
					65+20+32,
					110+20,
					130+20,
					60+20,
					moveList.moonblast,
					moveList.shadowBall,
					moveList.psyshock,
					moveList.hiddenPowerFire);
				
				Pokemon medicham = new Pokemon(
					"Medicham",
					typeList.psychic,
					typeList.fighting,
					60+75,
					(60+20+32)*2,
					75+20,
					60+20,
					75+20,
					80+20+32,
					moveList.highJumpKick,
					moveList.zenHeadbutt,
					moveList.icePunch,
					moveList.poisonJab);			
				
				//Initialize the Pokemon available for the player
				Pokemon venusaur = new Pokemon(
					"Venusaur",
					typeList.grass,
					typeList.poison,
					80+75+32,
					82+20,
					83+20+32,
					100+20,
					100+20,
					80+20,
					moveList.gigaDrain,
					moveList.sludgeBomb,
					moveList.earthquake,
					moveList.re_turn);
				
				Pokemon charizard = new Pokemon(
					"Charizard",
					typeList.fire,
					typeList.flying,
					78+75,
					84+20,
					78+20,
					109+20+32,
					85+20,
					100+20+32,
					moveList.heatWave,
					moveList.airSlash,
					moveList.dragonPulse,
					moveList.focusBlast);
				
				Pokemon blastoise = new Pokemon(
					"Blastoise",
					typeList.water,
					typeList.none,
					79+75+32,
					73+20,
					100+20,
					85+20+32,
					105+20,
					78+20,
					moveList.hydroPump,
					moveList.iceBeam,
					moveList.auraSphere,
					moveList.darkPulse);
					
				Pokemon alo_raichu = new Pokemon(
					"Raichu (Alolan)",
					typeList.electric,
					typeList.psychic,
					60+75,
					85+20,
					50+20,
					95+20+32,
					90+20,
					110+20+32,
					moveList.thunderBolt,
					moveList.psychic_move,
					moveList.focusBlast,
					moveList.grassKnot);
					
				Pokemon meganium = new Pokemon(
					"Meganium",
					typeList.grass,
					typeList.none,
					80+75+32,
					82+20,
					100+20,
					83+20,
					100+20+32,
					80+20,
					moveList.gigaDrain,
					moveList.earthquake,
					moveList.ancientPower,
					moveList.dragonTail);
				
				Pokemon typhlosion = new Pokemon(
					"Typhlosion",
					typeList.fire,
					typeList.none,
					78+75,
					84+20,
					78+20,
					109+20+32,
					85+20,
					100+20+32,
					moveList.eruption,
					moveList.fireBlast,
					moveList.focusBlast,
					moveList.hiddenPowerGrass);
				
				Pokemon feraligatr = new Pokemon(
					"Feraligatr",
					typeList.water,
					typeList.none,
					85+75,
					105+20+32,
					100+20,
					79+20,
					83+20,
					78+20+32,
					moveList.waterfall,
					moveList.icePunch,
					moveList.crunch,
					moveList.earthquake);
				
				Pokemon sceptile = new Pokemon(
					"Sceptile",
					typeList.grass,
					typeList.none,
					70+75,
					85+20+32,
					65+20,
					105+20,
					85+20,
					120+20+32,
					moveList.leafBlade,
					moveList.leafStorm,
					moveList.rockSlide,
					moveList.x_scissor);
				
				Pokemon blaziken = new Pokemon(
					"Blaziken",
					typeList.fire,
					typeList.fighting,
					80+75,
					120+20+32,
					70+20,
					110+20,
					70+20,
					80+20+32,
					moveList.blazeKick,
					moveList.skyUppercut,
					moveList.braveBird,
					moveList.thunderPunch);
				
				Pokemon swampert = new Pokemon(
					"Swampert",
					typeList.water,
					typeList.ground,
					100+75+32,
					110+20,
					90+20,
					85+20+32,
					90+20,
					60+20,
					moveList.scald,
					moveList.earthquake,
					moveList.icePunch,
					moveList.rockSlide);
				
				Pokemon whiscash = new Pokemon(
					"Whiscash",
					typeList.water,
					typeList.ground,
					110+75,
					78+20+32,
					73+20,
					76+20,
					71+20,
					60+20+32,
					moveList.waterfall,
					moveList.earthquake,
					moveList.stoneEdge,
					moveList.zenHeadbutt);
				
				Pokemon torterra = new Pokemon(
					"Torterra",
					typeList.grass,
					typeList.ground,
					95+75+32,
					109+20+32,
					105+20,
					75+20,
					85+20,
					56+20,
					moveList.seedBomb,
					moveList.earthquake,
					moveList.rockSlide,
					moveList.superPower);
					
				Pokemon empoleon = new Pokemon(
					"Empoleon",
					typeList.water,
					typeList.steel,
					84+75+32,
					86+20,
					88+20,
					111+20+32,
					101+20,
					60+20,
					moveList.scald,
					moveList.flashCannon,
					moveList.iceBeam,
					moveList.aquaJet);
				
				Pokemon garchomp = new Pokemon(
					"Garchomp",
					typeList.dragon,
					typeList.ground,
					108+75,
					130+20+32,
					95+20,
					80+20,
					85+20,
					102+20+32,
					moveList.dragonRush,
					moveList.earthquake,
					moveList.fireFang,
					moveList.rockSlide);
				
				Pokemon serperior = new Pokemon(
					"Serperior",
					typeList.grass,
					typeList.none,
					75+75+32,
					75+20,
					95+20,
					75+20,
					95+20,
					113+20+32,
					moveList.leafStorm,
					moveList.gigaDrain,
					moveList.dragonPulse,
					moveList.hiddenPowerFire);
				
				Pokemon emboar = new Pokemon(
					"Emboar",
					typeList.fire,
					typeList.fighting,
					110+75,
					123+20+32,
					65+20+32,
					100+20,
					65+20,
					65+20,
					moveList.flareBlitz,
					moveList.headSmash,
					moveList.wildCharge,
					moveList.suckerPunch);
				
				Pokemon samurott = new Pokemon(
					"Samurott",
					typeList.water,
					typeList.none,
					95+75+32,
					100+20+32,
					85+20,
					108+20,
					70+20,
					70+20,
					moveList.razorShell,
					moveList.megahorn,
					moveList.revenge,
					moveList.aquaJet);
					
				Pokemon chesnaught = new Pokemon(
					"Chesnaught",
					typeList.grass,
					typeList.fighting,
					88+75+32,
					107+20+32,
					122+20,
					74+20,
					75+20,
					64+20,
					moveList.seedBomb,
					moveList.hammerArm,
					moveList.earthquake,
					moveList.stoneEdge);
				
				Pokemon delphox = new Pokemon(
					"Delphox",
					typeList.fire,
					typeList.psychic,
					75+75,
					69+20,
					72+20,
					114+20+32,
					100+20,
					104+20+32,
					moveList.fireBlast,
					moveList.psychic_move,
					moveList.shadowBall,
					moveList.dazzlingGleam);
				
				Pokemon greninja = new Pokemon(
					"Greninja",
					typeList.water,
					typeList.dark,
					72+75,
					75+20,
					67+20,
					103+20+32,
					71+20,
					122+20+32,
					moveList.hydroPump,
					moveList.darkPulse,
					moveList.iceBeam,
					moveList.extrasensory);					
}
