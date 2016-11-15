package Pokemons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Pokemons.Pokemon.Species;
import Pokemons.Type.Types;

public class Move implements Serializable{

	private static final long serialVersionUID = -171009185641094367L;
	//TODO
	public String name;
	public Moves move;
	public String sideEffect; //TODO
	public int MaxPP;
	public int PPUp = 5;
	public int PP;
	public int Power;
	public int Accuracy;
	public Types type;
	
	public Move(Moves move){
		this.name = move.toString();
		this.move = move;
		this.Power = move.getPower(move);
		this.MaxPP = move.getPPMax(move);
		this.Accuracy = move.getAccuracy(move);
		this.MaxPP = MaxPP*(PPUp/5);
		this.PP = this.MaxPP;
		this.type = getType(move);
	}
	
	public enum Moves {
		Absorb(1),Acid(2),AcidArmor(3),Agility(4),Amnesia(5),AuroraBeam(6),Barrage(7),Barrier(8),Bide(9),Bind(10),
		Bite(11),Blizzard(12),BodySlam(13),BoneClub(14),Bonemerang(15),Bubble(16),BubbleBeam(17),Clamp(18),CometPunch(19),ConfuseRay(20),
		Confusion(21),Constrict(22),Conversion(23),Counter(24),Crabhammer(25),Cut(26),DefenceCurl(27),Dig(28),Disable(29),DizzyPunch(30),
		DoubleKick(31),DoubleSlap(32),DoubleTeam(33),DoubleEdge(34), DragonRage(35),DreamEater(36),DrillPeck(37),Earthquake(38),EggBomb(39),Ember(40),
		Explosion(41),FireBlast(42),FirePunch(43),FireSpin(44),Fissure(45),Flamethrower(46),Flash(47),Fly(48),FocusEnergy(49),FuryAttack(50),
		FurySwipes(51),Glare(52),Growl(53),Growth(54),Guillotine(55),Gust(56),Harden(57),Haze(58),Headbutt(59),HighJumpKick(60),
		HornAttack(61),HornDrill(62),HydroPump(63),HyperBeam(64),HyperFang(65),Hypnosis(66),IceBeam(67),IcePunch(66),JumpKick(67),KarateChop(68),Kinesis(69),LeechLife(70),
		LeechSeed(71),Leer(72),Lick(73),LightScreen(74),LovelyKiss(75),LowKick(76),Meditate(77),MegaDrain(78),MegaKick(79),MegaPunch(80),
		Metronome(81),Mimic(82),Minimize(83),MirrorMove(84),Mist(85),NightShade(86),PayDay(87),Peck(88),PetalDance(89),PinMissile(90),
		PoisonGas(91),PoisonPowder(92),PoisonSting(93),Pound(94),Psybeam(95),Psychic(96),Psywave(97),QuickAttack(98),Rage(99),RazorLeaf(100),
		RazorWind(101),Recover(102),Reflect(103),Rest(104),Roar(105),RockSlide(106),RockThrow(107),RollingKick(108),SandAttack(109),Scratch(110),
		Screech(111),SeismicToss(112),SelfDestruct(113), Sharpen(114),Sing(115),SkullBash(116),SkyAttack(117),Slam(118),Slash(119),SleepPowder(120),
		Sludge(121),Smog(122),Smokescreen(123),SoftBoiled(124),SolarBeam(125),SonicBoom(126),SpikeCannon(127),Splash(128),Spore(129),Stomp(130),
		Strength(131),StringShot(132),Struggle(133),StunSpore(134),Submission(135),Substitute(136),SuperFang(137),Supersonic(138),Surf(139),Swift(140),
		SwordsDance(141),Tackle(142),TailWhip(143),TakeDown(144),Teleport(145),Thrash(146),Thunder(147),ThunderPunch(148),ThunderShock(149),ThunderWave(150),
		Thunderbolt(151),Toxic(152),Transform(153),TriAttack(154),Twineedle(155),ViceGrip(156),VineWhip(157),WaterGun(158),Waterfall(159),Whirlwind(160),
		WingAttack(161),Withdraw(162),Wrap(163);
		public int moves;
		
		Moves(int m){
			moves = m;
		}
		
		int getPower(Moves move) {
			switch (move) {
			case Constrict:
				return 10;
			case Wrap: case PoisonSting: case Barrage: case FuryAttack: case Bind: case DoubleSlap:
				return 15;
			case FurySwipes: case CometPunch:
				return 18;
			case LeechLife: case SpikeCannon: case Rage: case Absorb:
				return 20;
			case PinMissile: case Twineedle:
				return 25;
			case Smog: case Lick: case DoubleKick:
				return 30;
			case Clamp: case Peck: case FireSpin:
				return 35;
			case Acid: case Gust: case WaterGun: case Pound: case Ember: case QuickAttack: case MegaDrain: case Bubble: case Scratch: case ThunderShock: case PayDay:
				return 40;
			case VineWhip:
				return 45;
			case RockThrow: case Cut: case Struggle: case KarateChop: case Confusion: case Tackle: case Bonemerang:
				return 50;
			case ViceGrip: case RazorLeaf:
				return 55;
			case RollingKick: case Bite: case WingAttack: case Swift:
				return 60;
			case Stomp: case Sludge: case BoneClub: case AuroraBeam: case BubbleBeam: case HornAttack: case Psybeam:
				return 65;
			case Slash: case DizzyPunch: case Headbutt: 
				return 70;
			case FirePunch: case ThunderPunch: case IcePunch: case RockSlide:
				return 75;
			case RazorWind: case Strength: case MegaPunch: case Slam: case TriAttack: case Waterfall: case DrillPeck: case Submission: case Dig: case HyperFang:
				return 80;
			case BodySlam:
				return 85;
			case TakeDown: case Psychic: case Flamethrower: case Fly: case Thunderbolt: case IceBeam: case Surf:
				return 90;
			case DreamEater: case JumpKick: case Crabhammer: case Earthquake: case EggBomb:
				return 100;
			case Thunder: case Blizzard: case FireBlast: case HydroPump:
				return 110;
			case SolarBeam: case DoubleEdge: case PetalDance: case MegaKick: case Thrash:
				return 120;
			case HighJumpKick: case SkullBash:
				return 130;
			case SkyAttack:
				return 140;
			case HyperBeam:
				return 150;
			case SelfDestruct:
				return 200;
			case Explosion:
				return 250;
			default:
				return 0;
			}
		}
		
		int getAccuracy(Moves move) {
			switch (move) {
			case Sing: case Supersonic:
				return 55;
			case Hypnosis:
				return 60;
			case Smog: case Thunder: case Blizzard:
				return 70;
			case LovelyKiss: case EggBomb: case PoisonPowder: case SleepPowder: case MegaKick: case StunSpore: case Slam:
				return 75;
			case Submission: case Kinesis: case Psywave: case FurySwipes: case HydroPump:
				return 80;
			case Barrage: case BoneClub: case FireBlast: case FireSpin: case MegaPunch: case Clamp: case FuryAttack: case CometPunch: case Screech: case TakeDown: case Bind: case DoubleSlap: case RollingKick:
				return 85;
			case Wrap: case SuperFang: case SonicBoom: case Bonemerang: case PoisonGas: case HighJumpKick: case LeechSeed: case SkyAttack: case Toxic: case Crabhammer: case RockSlide: case RockThrow: case HyperBeam: case HyperFang:
				return 90;
			case StringShot: case RazorLeaf: case PinMissile: case Fly: case Cut: case JumpKick:
				return 95;
			case Glare: case Growl: case ThunderShock: case ThunderPunch: case Gust: case VineWhip: case Thrash: case Headbutt: case ConfuseRay: case HornAttack: case Confusion: case Constrict: case Twineedle: case Counter: case ViceGrip: case IceBeam: case IcePunch: case WingAttack: case KarateChop: case TriAttack: case LeechLife: case Dig: case Leer: case Lick: case TailWhip: case Disable: case LowKick: case Tackle: case MegaDrain: case DizzyPunch: case DoubleKick: case Acid: case Surf: case Bite: case Waterfall: case DoubleEdge: case NightShade: case PayDay: case Peck: case PetalDance: case DragonRage: case DreamEater: case DrillPeck: case PoisonSting: case Pound: case Psybeam: case Psychic: case Earthquake: case QuickAttack: case Rage: case BodySlam: case RazorWind: case Ember: case Struggle: case Explosion: case Strength: case WaterGun: case FirePunch: case AuroraBeam: case SandAttack: case Scratch: case Thunderbolt: case SeismicToss: case SelfDestruct: case Stomp: case Flamethrower: case SkullBash: case Flash: case Bubble: case Slash: case BubbleBeam: case Smokescreen: case Spore: case SolarBeam: case Absorb: case SpikeCannon:
				return 100;
			case Swift:
				return 2000;//TODO always to hit			
			default:
				return 0;//TODO what else
			}
		}
		
		public int getPPMax(Moves move) {
			switch (move) {
			case Fissure: case Explosion: case HornDrill: case MegaKick: case HydroPump: case FireBlast: case Blizzard: case Guillotine: case SkyAttack: case HyperBeam: case SelfDestruct:
				return 5;
			case Bonemerang: case Recover: case Transform: case Mimic: case LovelyKiss: case Clamp: case EggBomb: case SoftBoiled: case Metronome: case DoubleSlap: case SolarBeam: case SuperFang: case Minimize: case SkullBash: case HighJumpKick: case LeechSeed: case Thunder: case Toxic: case Crabhammer: case RockSlide: case Substitute: case Rest: case JumpKick: case Bide: case RazorWind: case Thrash: case ConfuseRay: case Earthquake: case Psychic: case DragonRage: case PetalDance: case IceBeam: case TriAttack: case Dig: case DizzyPunch:
				return 10;
			case DoubleTeam: case Thunderbolt: case Fly: case SandAttack: case Spore: case FirePunch: case Strength: case FurySwipes: case ThunderPunch: case Struggle: case Sing: case CometPunch: case Headbutt: case SleepPowder: case BodySlam: case Kinesis: case SpikeCannon: case DreamEater: case Psywave: case RollingKick: case RockThrow: case IcePunch: case NightShade: case DoubleEdge: case FireSpin: case LeechLife: case HyperFang: case Waterfall: case Surf: case Flamethrower: case MegaDrain:
				return 15;
			case ThunderWave: case LowKick: case Disable: case Hypnosis: case Smog: case Supersonic: case Whirlwind: case AcidArmor: case Amnesia: case Barrier: case Slam: case PayDay: case Teleport: case SwordsDance: case Counter: case Twineedle: case DrillPeck: case Barrage: case BoneClub: case Psybeam: case MegaPunch: case MirrorMove: case FuryAttack: case Rage: case Reflect: case Roar: case TakeDown: case Swift: case Bind: case Wrap: case SonicBoom: case Smokescreen: case AuroraBeam: case BubbleBeam: case Sludge: case PinMissile: case SeismicToss: case Slash: case Stomp: case Flash:
				return 20;
			case Confusion: case RazorLeaf: case WaterGun: case Absorb: case Ember: case Bite: case VineWhip: case HornAttack: case KarateChop: case Submission:
				return 25;
			case Acid: case ThunderShock: case Lick: case Haze: case TailWhip: case Harden: case DoubleKick: case Sharpen: case Cut: case Leer: case Glare: case FocusEnergy: case Mist: case QuickAttack: case StunSpore: case Bubble: case Agility: case Conversion: case ViceGrip: case LightScreen:
				return 30;
			case PoisonPowder: case Peck: case Pound: case WingAttack: case Constrict: case PoisonSting: case Gust: case Scratch: case Tackle:
				return 35;
			case DefenceCurl: case Withdraw: case Splash: case StringShot: case Growl: case Meditate: case Screech: case PoisonGas:
				return 40;
			default:
				return 0;
			}
		}
	}
	
	public Types getType(Moves move){
		switch (move) {
		case Tackle:
			return Types.Normal;
			
		default:
			return null;
		}
	}

	public static List<Move> getMoves(Species species, int level) {
		List<Move> moves = new ArrayList<Move>();
		switch (species) {
		case Bulbasaur:
			if (level>=1) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Tackle));
				moves.add(new Move(Moves.Growl));
			} else {}
			if (level>=7) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.LeechSeed));
			}
			if (level>=13) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.VineWhip));
			}
			if (level>=20) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.PoisonPowder));
			}
			if (level>=27) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.RazorLeaf));
			}
			if (level>=34) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Growth));
			}
			if (level>=41) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SleepPowder));
			}
			if (level>=48) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SolarBeam));
			}
			return moves;
		case Ivysaur:
			if (level>=1) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Tackle));
				moves.add(new Move(Moves.Growl));
				moves.add(new Move(Moves.LeechSeed));
			}
			if (level>=7) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.LeechSeed));
			}
			if (level>=13) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.VineWhip));
			}
			if (level>=22) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.PoisonPowder));
			}
			if (level>=30) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.RazorLeaf));
			}
			if (level>=38) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Growth));
			}
			if (level>=46) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SleepPowder));
			}
			if (level>=54) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SolarBeam));
			}
			return moves;
		case Venusaur:
			if (level>=1) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Tackle));
				moves.add(new Move(Moves.Growl));
				moves.add(new Move(Moves.LeechSeed));
				moves.add(new Move(Moves.VineWhip));
			}
			if (level>=7) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.LeechSeed));
			}
			if (level>=13) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.VineWhip));
			}
			if (level>=22) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.PoisonPowder));
			}
			if (level>=30) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.RazorLeaf));
			}
			if (level>=43) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.Growth));
			}
			if (level>=55) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SleepPowder));
			}
			if (level>=65) {
				if (moves.size()>3) {
					moves.remove(0 + (int)(Math.random() * 3));
				}
				moves.add(new Move(Moves.SolarBeam));
			}
			return moves;
		case Abra:
			break;
		case Aerodactyl:
			break;
		case Alakazam:
			break;
		case Arbok:
			break;
		case Arcanine:
			break;
		case Articuno:
			break;
		case Beedrill:
			break;
		case Bellsprout:
			break;
		case Blastiose:
			break;
		case Butterfree:
			break;
		case Caterpie:
			break;
		case Chansey:
			break;
		case Charizard:
			break;
		case Charmander:
			break;
		case Charmeleon:
			break;
		case Clefable:
			break;
		case Clefairy:
			break;
		case Cloyster:
			break;
		case Cubone:
			break;
		case Dewgong:
			break;
		case Diglett:
			break;
		case Ditto:
			break;
		case Dodrio:
			break;
		case Doduo:
			break;
		case Dragonair:
			break;
		case Dragonite:
			break;
		case Dratini:
			break;
		case Drowzee:
			break;
		case Dugtrio:
			break;
		case Eevee:
			break;
		case Ekans:
			break;
		case Electabuzz:
			break;
		case Electrode:
			break;
		case Exeggcute:
			break;
		case Exeggutor:
			break;
		case Farfetchd:
			break;
		case Fearow:
			break;
		case Flareon:
			break;
		case Gastly:
			break;
		case Gengar:
			break;
		case Geodude:
			break;
		case Gloom:
			break;
		case Golbat:
			break;
		case Goldeen:
			break;
		case Golduck:
			break;
		case Golem:
			break;
		case Graveler:
			break;
		case Grimer:
			break;
		case Growlithe:
			break;
		case Gyarados:
			break;
		case Haunter:
			break;
		case Hitmonchan:
			break;
		case Hitmonlee:
			break;
		case Horsea:
			break;
		case Hypno:
			break;
		case Jigglypuff:
			break;
		case Jolteon:
			break;
		case Jynx:
			break;
		case Kabuto:
			break;
		case Kabutops:
			break;
		case Kadabra:
			break;
		case Kakuna:
			break;
		case Kangaskhan:
			break;
		case Kingler:
			break;
		case Koffing:
			break;
		case Krabby:
			break;
		case Lapras:
			break;
		case Lickitung:
			break;
		case Machamp:
			break;
		case Machoke:
			break;
		case Machop:
			break;
		case Magikarp:
			break;
		case Magmar:
			break;
		case Magnemite:
			break;
		case Magneton:
			break;
		case Mankey:
			break;
		case Marowak:
			break;
		case Meowth:
			break;
		case Metapod:
			break;
		case Mew:
			break;
		case Mewtwo:
			break;
		case Moltres:
			break;
		case MrMime:
			break;
		case Muk:
			break;
		case Nidoking:
			break;
		case Nidoqueen:
			break;
		case NidoranFemale:
			break;
		case NidoranMale:
			break;
		case Nidorina:
			break;
		case Nidorino:
			break;
		case Ninetales:
			break;
		case Oddish:
			break;
		case Omanyte:
			break;
		case Omastar:
			break;
		case Onix:
			break;
		case Paras:
			break;
		case Parasect:
			break;
		case Persian:
			break;
		case Pidgeot:
			break;
		case Pidgeotto:
			break;
		case Pidgey:
			break;
		case Pikachu:
			break;
		case Pinsir:
			break;
		case Poliwag:
			break;
		case Poliwhirl:
			break;
		case Poliwrath:
			break;
		case Ponyta:
			break;
		case Porygon:
			break;
		case Primeape:
			break;
		case Psyduck:
			break;
		case Raichu:
			break;
		case Rapidash:
			break;
		case Raticate:
			break;
		case Rattata:
			break;
		case Rhydon:
			break;
		case Rhyhorn:
			break;
		case Sandshrew:
			break;
		case Sandslash:
			break;
		case Scyther:
			break;
		case Seadra:
			break;
		case Seaking:
			break;
		case Seel:
			break;
		case Shellder:
			break;
		case Slowbro:
			break;
		case Slowpoke:
			break;
		case Snorlax:
			break;
		case Spearow:
			break;
		case Squirtle:
			break;
		case Starmie:
			break;
		case Staryu:
			break;
		case Tangela:
			break;
		case Tauros:
			break;
		case Tentacool:
			break;
		case Tentacruel:
			break;
		case Vaporeon:
			break;
		case Venomoth:
			break;
		case Venonat:
			break;
		case Victreebel:
			break;
		case Vileplume:
			break;
		case Voltorb:
			break;
		case Vulpix:
			break;
		case Wartortle:
			break;
		case Weedle:
			break;
		case Weepinbell:
			break;
		case Weezing:
			break;
		case Wigglytuff:
			break;
		case Zapdos:
			break;
		case Zubat:
			break;
		default:
			break;
		}
		return moves;
	}
	
	public void viewMoves(Pokemon pokemon) {
		List<Move> moves = pokemon.moves;
		if (moves.isEmpty()) {
			System.out.println("No moves!");
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(i+1 + ": ");
			if (moves.size() > i) {
				System.out.println(moves.get(i).name);
			} else { 
				System.out.println("");
			}
		}
	}
}
