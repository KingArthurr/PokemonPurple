package Pokemons;

import Pokemons.Pokemon.Species;

public class Stats {
	
	public static int getHP(int basehpstat, int IV, int hpstat, int EV, int level) {
		double HP1 = ((IV+2*basehpstat+(EV/4))*level/100)+10+level;
		int HP = (int) (HP1 - hpstat);
		return HP;
	}
	
	public static int getStat(int basestat, int IV, int stat, int EV, int level) {
		double STAT1 = (((IV+2*basestat+(EV/4))*level/100)+5);
		int STAT = (int) (STAT1 - stat);
		return STAT;
	}
	
	public static int[] getBaseStats(Species species) {
		switch (species) {
		case Bulbasaur: 
			int[] basestats1 = {45, 49, 49, 65, 65, 45};
			return basestats1;
		case Ivysaur:
			int[] basestats2 = {60,62,63,80,80,60};
			return basestats2;
		case Venusaur:
			int[] basestats3 = {80,82,83,100,100,80};
			return basestats3;
		case Charmander:
			int[] basestats4 = {39,52,43,60,50,65};
			return basestats4;
		case Charmeleon:
			int[] basestats5 = {58,64,58,80,65,80};
			return basestats5;
		case Charizard:
			int[] basestats6 = {78,84,78,109,85,100};
			return basestats6;
		case Squirtle:
			int[] basestats7 = {44,48,65,50,64,43};
			return basestats7;
		case Wartortle:
			int[] basestats8 = {59,63,80,65,80,58};
			return basestats8;
		case Blastiose:
			int[] basestats9 = {79,83,100,85,105,78};
			return basestats9;
		case Caterpie:
			int[] basestats10 = {45,30,35,20,20,45};
			return basestats10;
		case Metapod:
			int[] basestats11 = {50,20,55,25,25,30};
			return basestats11;
		case Butterfree:
			int[] basestats12 = {60,45,50,80,80,70};
			return basestats12;
		case Weedle:
			int[] basestats13 = {40,35,30,20,20,50};
			return basestats13;
		case Kakuna:
			int[] basestats14 = {45,25,50,25,25,35};
			return basestats14;
		case Beedrill:
			int[] basestats15 = {65,80,40,45,80,75};
			return basestats15;
		case Pidgey:
			int[] basestats16 = {40,45,40,35,35,56};
			return basestats16;
		case Pidgeotto:
			int[] basestats17 = {63,60,55,50,50,71};
			return basestats17;
		case Pidgeot:
			int[] basestats18 = {83,80,75,70,70,91};
			return basestats18;
		case Rattata:
			int[] basestats19 = {30,56,35,25,35,72};
			return basestats19;
		case Raticate:
			int[] basestats20 = {55,81,60,50,70,97};
			return basestats20;
		case Spearow:
			int[] basestats21 = {40,60,30,31,31,70};
			return basestats21;
		case Fearow:
			int[] basestats22 = {65,90,65,61,61,100};
			return basestats22;
		case Ekans:
			int[] basestats23 = {35,60,44,40,54,55};
			return basestats23;
		case Arbok:
			int[] basestats24 = {60,85,69,65,79,80};
			return basestats24;
		case Pikachu:
			int[] basestats25 = {35,55,30,50,40,90};
			return basestats25;
		case Raichu:
			int[] basestats26 = {60,90,55,90,80,100};
			return basestats26;
		case Sandshrew:
			int[] basestats27 = {50,75,85,20,30,40};
			return basestats27;
		case Sandslash:
			int[] basestats28 = {75,100,110,45,55,65};
			return basestats28;
		case NidoranFemale:
			int[] basestats29 = {55,47,52,40,40,41};
			return basestats29;
		case Nidorina:
			int[] basestats30 = {70,62,67,55,55,56};
			return basestats30;
		case Nidoqueen:
			int[] basestats31 = {90,82,87,75,85,76};
			return basestats31;
		case NidoranMale:
			int[] basestats32 = {46,57,40,40,40,50};
			return basestats32;
		case Nidorino:
			int[] basestats33 = {61,72,57,55,55,65};
			return basestats33;
		case Nidoking:
			int[] basestats34 = {81,92,77,85,75,85};
			return basestats34;
		case Clefairy:
			int[] basestats35 = {70,45,48,60,65,35};
			return basestats35;
		case Clefable:
			int[] basestats36 = {95,70,73,85,90,60};
			return basestats36;
		case Vulpix:
			int[] basestats37 = {38,41,40,50,65,65};
			return basestats37;
		case Ninetales:
			int[] basestats38 = {73,76,75,81,100,100};
			return basestats38;
		case Jigglypuff:
			int[] basestats39 = {115,45,20,45,25,20};
			return basestats39;
		case Wigglytuff:
			int[] basestats40 = {140,70,45,75,50,45};
			return basestats40;
		case Zubat:
			int[] basestats41 = {40,45,35,30,40,55};
			return basestats41;
		case Golbat:
			int[] basestats42 = {75,80,70,65,75,90};
			return basestats42;
		case Oddish:
			int[] basestats43 = {45,50,55,75,65,30};
			return basestats43;
		case Gloom:
			int[] basestats44 = {60,65,70,85,75,40};
			return basestats44;
		case Vileplume:
			int[] basestats45 = {75,80,85,100,90,50};
			return basestats45;
		case Paras:
			int[] basestats46 = {35,70,55,45,55,25};
			return basestats46;
		case Parasect:
			int[] basestats47 = {60,95,80,60,80,30};
			return basestats47;
		case Venonat:
			int[] basestats48 = {60,55,50,40,55,45};
			return basestats48;
		case Venomoth:
			int[] basestats49 = {70,65,60,90,75,90};
			return basestats49;
		case Diglett:
			int[] basestats50 = {10,55,25,35,45,95};
			return basestats50;
		case Dugtrio:
			int[] basestats51 = {35,80,50,50,70,120};
			return basestats51;
		case Meowth:
			int[] basestats52 = {40,45,35,40,40,90};
			return basestats52;
		case Persian:
			int[] basestats53 = {65,70,60,65,65,115};
			return basestats53;
		case Psyduck:
			int[] basestats54 = {50,52,48,65,50,55};
			return basestats54;
		case Golduck:
			int[] basestats55 = {80,82,78,95,80,85};
			return basestats55;
		case Mankey:
			int[] basestats56 = {40,80,35,35,45,70};
			return basestats56;
		case Primeape:
			int[] basestats57 = {65,105,60,60,70,95};
			return basestats57;
		case Growlithe:
			int[] basestats58 = {55,70,45,70,50,60};
			return basestats58;
		case Arcanine:
			int[] basestats59 = {90,110,80,100,80,95};
			return basestats59;
		case Poliwag:
			int[] basestats60 = {40,50,40,40,40,90};
			return basestats60;
		case Poliwhirl:
			int[] basestats61 = {65,65,65,50,50,90};
			return basestats61;
		case Poliwrath:
			int[] basestats62 = {90,85,95,70,90,70};
			return basestats62;
		case Abra:
			int[] basestats63 = {25,20,15,105,55,90};
			return basestats63;
		case Kadabra:
			int[] basestats64 = {40,35,30,120,70,105};
			return basestats64;
		case Alakazam:
			int[] basestats65 = {55,50,45,135,85,120};
			return basestats65;
		case Machop:
			int[] basestats66 = {70,80,50,35,35,35};
			return basestats66;
		case Machoke:
			int[] basestats67 = {80,100,70,50,60,45};
			return basestats67;
		case Machamp:
			int[] basestats68 = {90,130,80,65,85,55};
			return basestats68;
		case Bellsprout:
			int[] basestats69 = {50,75,35,70,30,40};
			return basestats69;
		case Weepinbell:
			int[] basestats70 = {65,60,50,85,45,55};
			return basestats70;
		case Victreebel:
			int[] basestats71= {80,105,65,100,60,70};
			return basestats71;
		case Tentacool:
			int[] basestats72 = {40,40,35,50,100,70};
			return basestats72;
		case Tentacruel:
			int[] basestats73 = {80,70,65,80,120,100};
			return basestats73;
		case Geodude:
			int[] basestats74 = {40,80,100,30,30,20};
			return basestats74;
		case Graveler:
			int[] basestats75 = {55,95,115,45,45,35};
			return basestats75;
		case Golem:
			int[] basestats76 = {80,110,130,55,65,45};
			return basestats76;
		case Ponyta:
			int[] basestats77 = {50,85,55,65,65,90};
			return basestats77;
		case Rapidash:
			int[] basestats78 = {65,100,70,80,80,105};
			return basestats78;
		case Slowpoke:
			int[] basestats79 = {90,65,65,40,40,15};
			return basestats79;
		case Slowbro:
			int[] basestats80 = {95,75,110,100,80,30};
			return basestats80;
		case Magnemite:
			int[] basestats81 = {25,35,70,95,55,45};
			return basestats81;
		case Magneton:
			int[] basestats82 = {50,60,95,120,70,70};
			return basestats82;
		case Farfetchd:
			int[] basestats83 = {53,65,55,58,62,60};
			return basestats83;
		case Doduo:
			int[] basestats84 = {35,85,45,35,35,75};
			return basestats84;
		case Dodrio:
			int[] basestats85 = {60,110,70,60,60,100};
			return basestats85;
		case Seel:
			int[] basestats86 = {65,45,55,45,70,45};
			return basestats86;
		case Dewgong:
			int[] basestats87 = {90,70,80,70,95,70};
			return basestats87;
		case Grimer:
			int[] basestats88 = {80,80,50,40,50,25};
			return basestats88;
		case Muk:
			int[] basestats89 = {105,105,75,65,100,50};
			return basestats89;
		case Shellder:
			int[] basestats90 = {30,65,100,45,25,40};
			return basestats90;
		case Cloyster:
			int[] basestats91 = {50,95,180,85,45,70};
			return basestats91;
		case Gastly:
			int[] basestats92 = {30,35,30,100,35,80};
			return basestats92;
		case Haunter:
			int[] basestats93 = {45,50,45,115,55,95};
			return basestats93;
		case Gengar:
			int[] basestats94 = {60,65,60,130,75,110};
			return basestats94;
		case Onix:
			int[] basestats95 = {35,45,160,30,45,70};
			return basestats95;
		case Drowzee:
			int[] basestats96 = {60,48,45,43,90,42};
			return basestats96;
		case Hypno:
			int[] basestats97 = {85,73,70,73,115,67};
			return basestats97;
		case Krabby:
			int[] basestats98 = {30,105,90,25,25,50};
			return basestats98;
		case Kingler:
			int[] basestats99 = {55,130,115,50,50,75};
			return basestats99;
		case Voltorb:
			int[] basestats100 = {40,30,50,55,55,100};
			return basestats100;
		case Electrode:
			int[] basestats101 = {60,50,70,80,80,140};
			return basestats101;
		case Exeggcute:
			int[] basestats102 = {60,40,80,60,45,40};
			return basestats102;
		case Exeggutor:
			int[] basestats103 = {95,95,85,125,65,55};
			return basestats103;
		case Cubone:
			int[] basestats104 = {50,50,95,40,50,35};
			return basestats104;
		case Marowak:
			int[] basestats105 = {60,80,110,50,80,45};
			return basestats105;
		case Hitmonlee:
			int[] basestats106 = {50,120,53,35,110,87};
			return basestats106;
		case Hitmonchan:
			int[] basestats107 = {50,105,79,35,110,76};
			return basestats107;
		case Lickitung:
			int[] basestats108 = {90,55,75,60,75,30};
			return basestats108;
		case Koffing:
			int[] basestats109 = {40,65,95,60,45,35};
			return basestats109;
		case Weezing:
			int[] basestats110 = {65,90,120,85,70,60};
			return basestats110;
		case Rhyhorn:
			int[] basestats111 = {80,85,95,30,30,25};
			return basestats111;
		case Rhydon:
			int[] basestats112 = {105,130,120,45,45,40};
			return basestats112;
		case Chansey:
			int[] basestats113 = {250,5,5,35,105,50};
			return basestats113;
		case Tangela:
			int[] basestats114 = {65,66,115,100,40,60};
			return basestats114;
		case Kangaskhan:
			int[] basestats115 = {105,95,80,40,80,90};
			return basestats115;
		case Horsea:
			int[] basestats116 = {30,40,70,70,25,60};
			return basestats116;
		case Seadra:
			int[] basestats117 = {55,65,95,95,45,85};
			return basestats117;
		case Goldeen:
			int[] basestats118 = {45,67,60,35,50,63};
			return basestats118;
		case Seaking:
			int[] basestats119 = {80,92,65,65,80,68};
			return basestats119;
		case Staryu:
			int[] basestats120 = {30,45,55,70,55,85};
			return basestats120;
		case Starmie:
			int[] basestats121 = {60,75,85,100,85,115};
			return basestats121;
		case MrMime:
			int[] basestats122 = {40,45,65,100,120,90};
			return basestats122;
		case Scyther:
			int[] basestats123 = {70,110,80,55,80,105};
			return basestats123;
		case Jynx:
			int[] basestats124 = {65,50,35,115,95,95};
			return basestats124;
		case Electabuzz:
			int[] basestats125 = {65,83,57,95,85,105};
			return basestats125;
		case Magmar:
			int[] basestats126 = {65,95,57,100,85,93};
			return basestats126;
		case Pinsir:
			int[] basestats127 = {65,125,100,55,70,85};
			return basestats127;
		case Tauros:
			int[] basestats128 = {75,100,95,40,70,110};
			return basestats128;
		case Magikarp:
			int[] basestats129 = {20,10,55,15,20,80};
			return basestats129;
		case Gyarados:
			int[] basestats130 = {95,125,79,60,100,81};
			return basestats130;
		case Lapras:
			int[] basestats131 = {130,85,80,85,95,60};
			return basestats131;
		case Ditto:
			int[] basestats132 = {48,48,48,48,48,48};
			return basestats132;
		case Eevee:
			int[] basestats133 = {55,55,50,45,65,55};
			return basestats133;
		case Vaporeon:
			int[] basestats134 = {130,65,60,110,95,65};
			return basestats134;
		case Jolteon:
			int[] basestats135 = {65,65,60,110,95,130};
			return basestats135;
		case Flareon:
			int[] basestats136 = {65,130,60,95,110,65};
			return basestats136;
		case Porygon:
			int[] basestats137 = {65,60,70,85,75,40};
			return basestats137;
		case Omanyte:
			int[] basestats138 = {35,40,100,90,55,35};
			return basestats138;
		case Omastar:
			int[] basestats139 = {70,60,125,115,70,55};
			return basestats139;
		case Kabuto:
			int[] basestats140 = {30,80,90,55,45,55};
			return basestats140;
		case Kabutops:
			int[] basestats141 = {60,115,105,65,70,80};
			return basestats141;
		case Aerodactyl:
			int[] basestats142 = {80,105,65,60,75,130};
			return basestats142;
		case Snorlax:
			int[] basestats143 = {160,110,65,65,110,30};
			return basestats143;
		case Articuno:
			int[] basestats144 = {90,85,100,95,125,85};
			return basestats144;
		case Zapdos:
			int[] basestats145 = {90,90,85,125,90,100};
			return basestats145;
		case Moltres:
			int[] basestats146 = {90,100,90,125,85,90};
			return basestats146;
		case Dratini:
			int[] basestats147 = {41,64,45,50,50,50};
			return basestats147;
		case Dragonair:
			int[] basestats148 = {61,84,65,70,70,70};
			return basestats148;
		case Dragonite:
			int[] basestats149 = {91,134,95,100,100,80};
			return basestats149;
		case Mewtwo:
			int[] basestats150 = {106,110,90,154,90,130};
			return basestats150;
		case Mew:
			int[] basestats151 = {100,100,100,100,100,100};
			return basestats151;
		default:
			return null;
		}	
	}
}
