package Pokemons;

import Pokemons.Pokemon.Species;

public class Evolve {

	public static Species checkEvolve(Species species, int lvl, Items.MiscItem item) {
		switch (species) {
		case Bulbasaur: 
			if (lvl == 16) {
				return Species.Ivysaur;
			}
		case Ivysaur:
			if (lvl == 32) {
			}
				return Species.Venusaur;
		case Charmander:
			if (lvl == 16) {
				return Species.Charmeleon;
			}
		case Charmeleon:
			if (lvl == 36) {
				return Species.Charizard;
			}
		case Squirtle:
			if (lvl == 16) {
				return Species.Wartortle;
			}
		case Wartortle:
			if (lvl == 36) {
				return Species.Blastiose;
			}
		case Caterpie:
			if (lvl == 7) {
				return Species.Metapod;
			}
		case Metapod:
			if (lvl == 10) {
				return Species.Butterfree;
			}
		case Weedle:
			if (lvl == 7) {
				return Species.Kakuna;
			}
		case Kakuna:
			if (lvl == 10) {
				return Species.Beedrill;
			}
		case Pidgey:
			if (lvl == 18) {
				return Species.Pidgeotto;
			}
		case Pidgeotto:
			if (lvl == 36) {
				return Species.Pidgeot;
			}
		case Rattata:
			if (lvl == 20) {
				return Species.Raticate;
			}
		case Spearow:
			if (lvl == 20) {
				return Species.Fearow;
			}
		case Ekans:
			if (lvl == 22) {
				return Species.Arbok;
			}
		case Pikachu:
			if (item.miscitem == Items.MiscItem.MiscItems.ThunderStone) {
				return Species.Raichu;
			}
		case Sandshrew:
			if (lvl == 22) {
				return Species.Sandslash;
			}
		case NidoranFemale:
			if (lvl == 16) {
				return Species.Nidorina;
			}
		case Nidorina:
			if (item.miscitem == Items.MiscItem.MiscItems.MoonStone) {
				return Species.Nidoqueen;
			}
		case NidoranMale:
			if (lvl == 16) {
				return Species.Nidorino;
			}
		case Nidorino:
			if (item.miscitem == Items.MiscItem.MiscItems.MoonStone) {
				return Species.Nidoking;
			}
		case Clefairy:
			if (item.miscitem == Items.MiscItem.MiscItems.MoonStone) {
				return Species.Clefable;
			}
		case Vulpix:
			if (item.miscitem == Items.MiscItem.MiscItems.FireStone) {
				return Species.Ninetales;
			}
		case Jigglypuff:
			if (item.miscitem == Items.MiscItem.MiscItems.MoonStone) {
				return Species.Wigglytuff;
			}
		case Zubat:
			if (lvl == 22) {
				return Species.Golbat;
			}
		case Oddish:
			if (lvl == 21) {
				return Species.Gloom;
			}
		case Gloom:
			if (item.miscitem == Items.MiscItem.MiscItems.LeafStone) {
				return Species.Vileplume;
			}
		case Paras:
			if (lvl == 24) {
				return Species.Parasect;
			}
		case Venonat:
			if (lvl == 31) {
				return Species.Venomoth;
			}
		case Diglett:
			if (lvl == 26) {
				return Species.Dugtrio;
			}
		case Meowth:
			if (lvl == 28) {
				return Species.Persian;
			}
		case Psyduck:
			if (lvl == 33) {
				return Species.Golduck;
			}
		case Mankey:
			if (lvl == 28) {
				return Species.Golduck;
			}
		case Growlithe:
			if (item.miscitem == Items.MiscItem.MiscItems.FireStone) {
				return Species.Arcanine;
			}
		case Poliwag:
			if (lvl == 25) {
				return Species.Poliwhirl;
			}
		case Poliwhirl:
			if (item.miscitem == Items.MiscItem.MiscItems.WaterStone) {
				return Species.Poliwrath;
			}
		case Abra:
			if (lvl == 17) {
				return Species.Kadabra;
			}
		case Kadabra: //TODO TRADE
			if (lvl == 41) {
				return Species.Alakazam;
			}
		case Machop:
			if (lvl == 28) {
				return Species.Machoke;
			}
		case Machoke: //TODO TRADE
			if (lvl == 41) {
				return Species.Machamp;
			}
		case Bellsprout:
			if (lvl == 21) {
				return Species.Weepinbell;
			}
		case Weepinbell:
			if (item.miscitem == Items.MiscItem.MiscItems.LeafStone) {
				return Species.Victreebel;
			}
		case Tentacool:
			if (lvl == 30) {
				return Species.Tentacruel;
			}
		case Geodude:
			if (lvl == 25) {
				return Species.Graveler;
			}
		case Graveler: //TODO TRADE
			if (lvl == 41) {
				return Species.Golem;
			}
		case Ponyta:
			if (lvl == 40) {
				return Species.Rapidash;
			}
		case Slowpoke:
			if (lvl == 37) {
				return Species.Slowbro;
			}
		case Magnemite:
			if (lvl == 30) {
				return Species.Magneton;
			}
		case Doduo:
			if (lvl == 31) {
				return Species.Dodrio;
			}
		case Seel:
			if (lvl == 34) {
				return Species.Dewgong;
			}
		case Grimer:
			if (lvl == 38) {
				return Species.Muk;
			}
		case Shellder:
			if (item.miscitem == Items.MiscItem.MiscItems.WaterStone) {
				return Species.Cloyster;
			}
		case Gastly:
			if (lvl == 25) {
				return Species.Haunter;
			}
		case Haunter: //TODO TRADE
			if (lvl == 41) {
				return Species.Gengar;
			}
		case Drowzee:
			if (lvl == 26) {
				return Species.Hypno;
			}
		case Krabby:
			if (lvl == 28) {
				return Species.Kingler;
			}
		case Voltorb:
			if (lvl == 30) {
				return Species.Electrode;
			}
		case Exeggcute:
			if (item.miscitem == Items.MiscItem.MiscItems.LeafStone) {
				return Species.Exeggutor;
			}
		case Cubone:
			if (lvl == 28) {
				return Species.Marowak;
			}
		case Koffing:
			if (lvl == 35) {
				return Species.Weezing;
			}
		case Rhyhorn:
			if (lvl == 42) {
				return Species.Rhydon;
			}
		case Horsea:
			if (lvl == 32) {
				return Species.Seadra;
			}
		case Goldeen:
			if (lvl == 33) {
				return Species.Seaking;
			}
		case Staryu:
			if (item.miscitem == Items.MiscItem.MiscItems.WaterStone) {
				return Species.Starmie;
			}
		case Magikarp:
			if (lvl == 20) {
				return Species.Gyarados;
			}
		case Eevee:
			if (item.miscitem == Items.MiscItem.MiscItems.FireStone) {
				return Species.Flareon;
			}
			if (item.miscitem == Items.MiscItem.MiscItems.WaterStone) {
				return Species.Vaporeon;
			}
			if (item.miscitem == Items.MiscItem.MiscItems.ThunderStone) {
				return Species.Jolteon;
			}
		case Omanyte:
			if (lvl == 40) {
				return Species.Omastar;
			}
		case Kabuto:
			if (lvl == 40) {
				return Species.Kabutops;
			}
		case Dratini:
			if (lvl == 30) {
				return Species.Dragonair;
			}
		case Dragonair:
			if (lvl == 55) {
				return Species.Dragonite;
			}
		default: 
			return species;
		}
	}
}
