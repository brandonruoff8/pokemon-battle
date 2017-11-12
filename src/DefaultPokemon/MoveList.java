package DefaultPokemon;

public class MoveList {
	
	TypeList typeList = new TypeList();
	
	// Initialize all valid moves
		
		Move airSlash = new Move(
			"Air Slash",
			typeList.flying,
			75.0,
			95.0,
			"SPECIAL",
			0);
		
		Move ancientPower = new Move(
			"Ancient Power",
			typeList.rock,
			60.0,
			100.0,
			"SPECIAL",
			0);
		
		Move aquaJet = new Move(
			"Aqua Jet",
			typeList.water,
			40.0,
			100.0,
			"PHYSICAL",
			1);
	
		Move aromatherapy = new Move(
			"Aromatherapy",
			typeList.grass,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move auraSphere = new Move(
			"Aura Sphere",
			typeList.fighting,
			80.0,
			1000.0,
			"SPECIAL",
			0);
		
		Move blazeKick = new Move(
			"Blaze Kick",
			typeList.fire,
			85.0,
			90.0,
			"PHYSICAL",
			0);
		
		Move braveBird = new Move(
			"Brave Bird",
			typeList.flying,
			120.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move bugBuzz = new Move(
			"Bug Buzz",
			typeList.bug,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move bulkUp = new Move(
			"Bulk Up",
			typeList.fighting,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move calmMind = new Move(
			"Calm Mind",
			typeList.psychic,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move closeCombat = new Move(
			"Close Combat",
			typeList.fighting,
			120.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move crunch = new Move (
			"Crunch",
			typeList.dark,
			80.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move darkPulse = new Move(
			"Dark Pulse",
			typeList.dark,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move dazzlingGleam = new Move(
			"Dazzling Gleam",
			typeList.fairy,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move dragonDance = new Move(
			"Dragon Dance",
			typeList.dragon,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move dragonPulse = new Move(
			"Dragon Pulse",
			typeList.dragon,
			85.0,
			100.0,
			"SPECIAL",
			0);
		
		Move dragonRush = new Move(
			"Dragon Rush",
			typeList.dragon,
			100.0,
			75.0,
			"PHYSICAL",
			0);
		
		Move dragonTail = new Move(
			"Dragon Tail",
			typeList.dragon,
			60.0,
			90.0,
			"PHYSICAL",
			-1);
		
		Move earthquake = new Move(
			"Earthquake",
			typeList.ground,
			100.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move energyBall = new Move(
			"Energy Ball",
			typeList.grass,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move eruption = new Move(
			"Eruption",
			typeList.fire,
			150.0,
			100.0,
			"SPECIAL",
			0);
		
		Move extrasensory = new Move(
			"Extrasensory",
			typeList.psychic,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move fireBlast = new Move(
			"Fire Blast",
			typeList.fire,
			110.0,
			85.0,
			"SPECIAL",
			0);
		
		Move fireFang = new Move(
			"Fire Fang",
			typeList.fire,
			65.0,
			95.0,
			"PHYSICAL",
			0);
		
		Move firePunch = new Move(
			"Fire Punch",
			typeList.fire,
			75.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move flareBlitz = new Move(
			"Flare Blitz",
			typeList.fire,
			120.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move flashCannon = new Move(
			"Flash Cannon",
			typeList.steel,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move focusBlast = new Move(
			"Focus Blast",
			typeList.fighting,
			120.0,
			70.0,
			"SPECIAL",
			0);
		
		Move gearGrind = new Move(
			"Gear Grind",
			typeList.steel,
			100.0,
			85.0,
			"PHYSICAL",
			0);
		
		Move gigaDrain = new Move(
			"Giga Drain",
			typeList.grass,
			75.0,
			100.0,
			"SPECIAL",
			0);
		
		Move grassKnot = new Move(
			"Grass Knot",
			typeList.grass,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move hammerArm = new Move(
			"Hammer Arm",
			typeList.fighting,
			100.0,
			90.0,
			"PHYSICAL",
			0);
		
		Move headSmash = new Move(
			"Head Smash",
			typeList.rock,
			150.0,
			80.0,
			"PHYSICAL",
			0);
		
		Move heatWave = new Move(
			"Heat Wave",
			typeList.fire,
			95.0,
			90.0,
			"SPECIAL",
			0);
		
		Move highJumpKick = new Move(
			"High Jump Kick",
			typeList.fighting,
			130.0,
			90.0,
			"PHYSICAL",
			0);
		
		Move hiddenPowerFire = new Move(
			"Hidden Power",
			typeList.fire,
			60.0,
			100.0,
			"SPECIAL",
			0);
		
		Move hiddenPowerGrass = new Move(
			"Hidden Power",
			typeList.grass,
			60.0,
			100.0,
			"SPECIAL",
			0);
		
		Move hiddenPowerIce = new Move(
			"Hidden Power",
			typeList.ice,
			60.0,
			100.0,
			"SPECIAL",
			0);
		
		Move hydroPump = new Move(
			"Hydro Pump",
			typeList.water,
			110.0,
			80.0,
			"SPECIAL",
			0);
		
		Move iceBeam = new Move(
			"Ice Beam",
			typeList.ice,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move icePunch = new Move(
			"Ice Punch",
			typeList.ice,
			75.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move leafBlade = new Move(
			"Leaf Blade",
			typeList.grass,
			90.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move leafStorm = new Move(
			"Leaf Storm",
			typeList.grass,
			130.0,
			90.0,
			"SPECIAL",
			0);
		
		Move megahorn = new Move(
			"Megahorn",
			typeList.bug,
			120.0,
			85.0,
			"PHYSICAL",
			0);
		
		Move moonblast = new Move(
			"Moonblast",
			typeList.fairy,
			95,
			100.0,
			"SPECIAL",
			0);
				
		Move poisonJab = new Move(
			"Poison Jab",
			typeList.poison,
			80.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move protect = new Move(
			"Protect",
			typeList.normal,
			0.0,
			100.0,
			"STATUS",
			2);
		
		Move psychic_move = new Move(
			"Psychic",
			typeList.psychic,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move psyshock = new Move(
			"Psyshock",
			typeList.psychic,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move razorShell = new Move(
			"Razor Shell",
			typeList.water,
			75.0,
			95.0,
			"PHYSICAL",
			0);
		
		Move re_turn = new Move(
			"Return",
			typeList.normal,
			102.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move revenge = new Move(
			"Revenge",
			typeList.fighting,
			120.0,
			100.0,
			"PHYSICAL",
			-1);
		
		Move rockSlide = new Move(
			"Rock Slide",
			typeList.rock,
			75.0,
			90.0,
			"PHYSICAL",
			0);
		
		Move roost = new Move(
			"Roost",
			typeList.flying,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move scald = new Move(
			"Scald",
			typeList.water,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move seedBomb = new Move(
			"Seed Bomb",
			typeList.grass,
			80.0,
			100.0,
			"PHYSICAL",
			0);
			
		Move shadowBall = new Move(
			"Shadow Ball",
			typeList.ghost,
			80.0,
			100.0,
			"SPECIAL",
			0);
		
		Move shiftGear = new Move(
			"Shift Gear",
			typeList.steel,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move skyUppercut = new Move(
			"Sky Uppercut",
			typeList.fighting,
			85.0,
			90.0,
			"PHYSICAL",
			0);
		
		Move sleepPowder = new Move(
			"Sleep Powder",
			typeList.grass,
			0.0,
			75.0,
			"STATUS",
			0);
		
		Move sludgeBomb = new Move(
			"Sludge Bomb",
			typeList.poison,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move stoneEdge = new Move(
			"Stone Edge",
			typeList.rock,
			100.0,
			80.0,
			"PHYSICAL",
			0);
		
		Move struggle = new Move(
			"Struggle",
			typeList.normal,
			1.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move suckerPunch = new Move(
			"Sucker Punch",
			typeList.dark,
			70.0,
			100.0,
			"PHYSICAL",
			1);
		
		Move superPower = new Move(
			"Superpower",
			typeList.fighting,
			120.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move swordsDance = new Move(
			"Swords Dance",
			typeList.normal,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move synthesis = new Move(
			"Synthesis",
			typeList.grass,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move thunder = new Move(
			"Thunder",
			typeList.electric,
			110.0,
			70.0,
			"SPECIAL",
			0);
		
		Move thunderBolt = new Move(
			"Thunderbolt",
			typeList.electric,
			90.0,
			100.0,
			"SPECIAL",
			0);
		
		Move thunderPunch = new Move(
			"Thunder Punch",
			typeList.electric,
			75.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move toxic = new Move(
			"Toxic",
			typeList.poison,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move waterfall = new Move(
			"Waterfall",
			typeList.water,
			80.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move wildCharge = new Move(
			"Wild Charge",
			typeList.electric,
			90.0,
			100.0,
			"PHYSICAL",
			0);
		
		Move wish = new Move(
			"Wish",
			typeList.normal,
			0.0,
			100.0,
			"STATUS",
			0);
		
		Move x_scissor = new Move(
			"X-Scissor",
			typeList.bug,
			80.0,
			100.0,
			"PHYSICAL",
			0);
		
	Move zenHeadbutt = new Move(
			"Zen Headbutt",
			typeList.psychic,
			80.0,
			90.0,
			"PHYSICAL",
			0);

}
