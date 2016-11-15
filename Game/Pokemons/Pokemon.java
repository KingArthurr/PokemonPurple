package Pokemons;

import java.io.Serializable;
import java.util.List;

import Pokemons.Type.Types;

public class Pokemon implements Serializable {
	
	private static final long serialVersionUID = -2280764990854534879L;

	public String name;
	public Species species;
	public int Health;
	public StatusEffects statuseffect;
	public List<Types> type;
	public List<Move> moves;
	public int level;
	public int HP = 0;
	public int EVHP = 0;
	public int IVHP;
	public int ATTACK = 0;
	public int XATT = 0;
	public int EVATT = 0;
	public int IVATT;
	public int DEFENCE = 0;
	public int XDEF = 0;
	public int EVDEF = 0;
	public int IVDEF;
	public int SATTACK = 0;
	public int XSATT = 0;
	public int EVSATT = 0;
	public int IVSATT;
	public int SDEFENCE = 0;
	public int XSDEF = 0;
	public int EVSDEF = 0;
	public int IVSDEF;
	public int SPEED = 0;
	public int XSPD = 0;
	public int EVSPD = 0;
	public int IVSPD;
	public int XACC = 0;
	public int XEVA = 0;
	public int XSTATPRCT = 0;
	public int XCRIT = 0;
	public int[] basestats;
	
	public Pokemon(Species species, int level) {
		this.name = species.toString();
		this.species = species;
	 	this.type = Type.getPokemonTypes(species);
	 	this.level = level;
	 	setIVs();
	 	setStats();
	 	setXStats();
	 	this.Health = this.HP;
	 	this.statuseffect = StatusEffects.None;
	 	moves = Move.getMoves(species, level);
	}
	
	public void setIVs() {
		IVHP = (int) (Math.random()*32);
		IVATT = (int) (Math.random()*32);
		IVDEF = (int) (Math.random()*32);
		IVSATT = (int) (Math.random()*32);
		IVSDEF = (int) (Math.random()*32);
		IVSPD = (int) (Math.random()*32);
	}
	
	public void setStats() {
		this.basestats = Stats.getBaseStats(species);
	 	this.HP += Stats.getHP(basestats[0],IVHP,HP,EVHP,level);
	 	this.ATTACK += Stats.getStat(basestats[1],IVATT,ATTACK,EVATT,level);
	 	this.DEFENCE += Stats.getStat(basestats[2],IVDEF,DEFENCE,EVDEF,level);
	 	this.SATTACK += Stats.getStat(basestats[3],IVSATT,SATTACK,EVSATT,level);
	 	this.SDEFENCE += Stats.getStat(basestats[4],IVSDEF,SDEFENCE,EVSDEF,level);
	 	this.SPEED += Stats.getStat(basestats[5],IVSPD,SPEED,EVSPD,level);
	}
	
	public void setXStats() {
		XATT = ATTACK;
		XDEF = DEFENCE;
		XSATT = SATTACK;
		XSDEF = SDEFENCE;
		XSPD = SPEED;
		XACC = 0;
		XEVA = 0;
		XCRIT = 0;
		XSTATPRCT = 0;
	}
	
	public void levelUp() {
		if (level < 100) {
			level++;
			evolve(null);
			setStats();	
			System.out.println("		HP	ATK	DEF	SAT	SDE	SPD");
			System.out.println("Stats:		" + HP + "	" + ATTACK + "	" + DEFENCE + "	" + 
												SATTACK + "	" + SDEFENCE + "	" + SPEED);
			System.out.println("Basestats:	" + basestats[0] + "	" + basestats[1] + "	" + basestats[2] + "	" + 
												basestats[3] + "	" + basestats[4] + "	" + basestats[5]);
		}
	}
	
	public void evolve(Items.MiscItem item) {
		Species species1 = species;
		species = Evolve.checkEvolve(species, level, item);
		this.type = Type.getPokemonTypes(species);
		if (name == species1.toString()) {
			name = species.toString();
		}
		setStats();
	}
	
	public enum Species {
		Bulbasaur(1), Ivysaur(2), Venusaur(3), Charmander(4), Charmeleon(5), Charizard(6), Squirtle(7), Wartortle(8), Blastiose(9), Caterpie(10), 
		Metapod(11), Butterfree(12), Weedle(13), Kakuna(14), Beedrill(15), Pidgey(16), Pidgeotto(17), Pidgeot(18), Rattata(19), Raticate(20), 
		Spearow(21), Fearow(22), Ekans(23), Arbok(24), Pikachu(25), Raichu(26), Sandshrew(27), Sandslash(28), NidoranFemale(29), Nidorina(30), 
		Nidoqueen(31), NidoranMale(32), Nidorino(33), Nidoking(34), Clefairy(35), Clefable(36), Vulpix(37), Ninetales(38), Jigglypuff(39), Wigglytuff(40), 
		Zubat(41), Golbat(42), Oddish(43), Gloom(44), Vileplume(45), Paras(46), Parasect(47), Venonat(48), Venomoth(49), Diglett(50), 
		Dugtrio(51), Meowth(52), Persian(53), Psyduck(54), Golduck(55), Mankey(56), Primeape(57), Growlithe(58), Arcanine(59), Poliwag(60),
		Poliwhirl(61), Poliwrath(62), Abra(63), Kadabra(64), Alakazam(65), Machop(66), Machoke(67), Machamp(68), Bellsprout(69), Weepinbell(70),
		Victreebel(71), Tentacool(72), Tentacruel(73), Geodude(74), Graveler(75), Golem(76), Ponyta(77), Rapidash(78), Slowpoke(79), Slowbro(80),
		Magnemite(81), Magneton(82), Farfetchd(83), Doduo(84), Dodrio(85), Seel(86), Dewgong(87), Grimer(88), Muk(89), Shellder(90),
		Cloyster(91), Gastly(92), Haunter(93), Gengar(94), Onix(95), Drowzee(96), Hypno(97), Krabby(98), Kingler(99), Voltorb (100),
		Electrode(101), Exeggcute(102), Exeggutor(103), Cubone(104), Marowak(105), Hitmonlee(106), Hitmonchan(107), Lickitung(108), Koffing(109), Weezing(110),
		Rhyhorn(111), Rhydon(112), Chansey(113), Tangela(114), Kangaskhan(115), Horsea(116), Seadra(117), Goldeen(118), Seaking(119), Staryu(120),
		Starmie(121), MrMime(122), Scyther(123), Jynx(124), Electabuzz(125), Magmar(126), Pinsir(127), Tauros(128), Magikarp(129), Gyarados(130),
		Lapras(131), Ditto(132), Eevee(133), Vaporeon(134), Jolteon(135), Flareon(136), Porygon(137), Omanyte(138), Omastar(139), Kabuto(140),
		Kabutops(141), Aerodactyl(142), Snorlax(143), Articuno(144), Zapdos(145), Moltres(146), Dratini(147), Dragonair(148), Dragonite(149), Mewtwo(150),
		Mew(151);
		public int species;
		
		Species(int s) {
			species = s;
		}
	}
	
	public enum StatusEffects {
		Burned(1), Poisoned(2), Paralyzed(3), Asleep(4), Frozen(5), None(6), FullHeal(7);
		public int statuseffects;
		
		StatusEffects(int s){
			statuseffects = s;
		}
	}
}
