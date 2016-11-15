package Pokemons;

import java.util.ArrayList;
import java.util.List;

import Pokemons.Move.Moves;
import Pokemons.Pokemon.Species;

public class Type {
		
	
	public enum Types {
        Normal(1), Fighting(2), Flying(3), Poison(4), Ground(5), Rock(6), Bug(7), Ghost(8),
        Fire(9), Water(10), Grass(11), Electric(12), Psychic(13), Ice(14), Dragon(15);
        public final int types;
        
        Types(int s) {
            types = s;
        }
    }
	
	public static List<Types> getPokemonTypes(Species species) {
		List<Types> types = new ArrayList<Types>();
		switch (species) {
		case Bulbasaur: 
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Ivysaur:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Venusaur:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Charmander:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Charmeleon:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Charizard:
			types.clear();
			types.add(Types.Fire);
			types.add(Types.Flying);
			return types;
		case Squirtle:
			types.clear();
			types.add(Types.Water);
			return types;
		case Wartortle:
			types.clear();
			types.add(Types.Water);
			return types;
		case Blastiose:
			types.clear();
			types.add(Types.Water);
			return types;
		case Caterpie:
			types.clear();
			types.add(Types.Bug);
			return types;
		case Metapod:
			types.clear();
			types.add(Types.Bug);
			return types;
		case Butterfree:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Flying);
			return types;
		case Weedle:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Poison);
			return types;
		case Kakuna:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Poison);
			return types;
		case Beedrill:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Poison);
			return types;
		case Pidgey:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Pidgeotto:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Pidgeot:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;

		case Rattata:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Raticate:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Spearow:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Fearow:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Ekans:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Arbok:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Pikachu:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Raichu:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Sandshrew:
			types.clear();
			types.add(Types.Ground);
			return types;
		case Sandslash:
			types.clear();
			types.add(Types.Ground);
			return types;
		case NidoranFemale:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Nidorina:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Nidoqueen:
			types.clear();
			types.add(Types.Poison);
			types.add(Types.Ground);
			return types;
		case NidoranMale:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Nidorino:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Nidoking:
			types.clear();
			types.add(Types.Poison);
			types.add(Types.Ground);
			return types;
		case Clefairy:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Clefable:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Vulpix:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Ninetales:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Jigglypuff:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Wigglytuff:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Zubat:
			types.clear();
			types.add(Types.Poison);
			types.add(Types.Flying);
			return types;
		case Golbat:
			types.clear();
			types.add(Types.Poison);
			types.add(Types.Flying);
			return types;
		case Oddish:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Gloom:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Vileplume:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Paras:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Grass);
			return types;
		case Parasect:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Grass);
			return types;
		case Venonat:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Poison);
			return types;
		case Venomoth:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Poison);
			return types;
		case Diglett:
			types.clear();
			types.add(Types.Ground);
			return types;
		case Dugtrio:
			types.clear();
			types.add(Types.Ground);
			return types;
		case Meowth:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Persian:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Psyduck:
			types.clear();
			types.add(Types.Water);
			return types;
		case Golduck:
			types.clear();
			types.add(Types.Water);
			return types;
		case Mankey:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Primeape:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Growlithe:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Arcanine:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Poliwag:
			types.clear();
			types.add(Types.Water);
			return types;
		case Poliwhirl:
			types.clear();
			types.add(Types.Water);
			return types;
		case Poliwrath:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Fighting);
			return types;
		case Abra:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Kadabra:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Alakazam:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Machop:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Machoke:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Machamp:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Bellsprout:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Weepinbell:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Victreebel:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Poison);
			return types;
		case Tentacool:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Poison);
			return types;
		case Tentacruel:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Poison);
			return types;
		case Geodude:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Ground);
			return types;
		case Graveler:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Ground);
			return types;
		case Golem:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Ground);
			return types;
		case Ponyta:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Rapidash:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Slowpoke:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Psychic);
			return types;
		case Slowbro:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Psychic);
			return types;
		case Magnemite:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Magneton:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Farfetchd:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Doduo:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Dodrio:
			types.clear();
			types.add(Types.Normal);
			types.add(Types.Flying);
			return types;
		case Seel:
			types.clear();
			types.add(Types.Water);
			return types;
		case Dewgong:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Bug);
			return types;
		case Grimer:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Muk:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Shellder:
			types.clear();
			types.add(Types.Water);
			return types;
		case Cloyster:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Ice);
			return types;
		case Gastly:
			types.clear();
			types.add(Types.Ghost);
			types.add(Types.Poison);
			return types;
		case Haunter:
			types.clear();
			types.add(Types.Ghost);
			types.add(Types.Poison);
			return types;
		case Gengar:
			types.clear();
			types.add(Types.Ghost);
			types.add(Types.Poison);
			return types;
		case Onix:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Ground);
			return types;
		case Drowzee:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Hypno:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Krabby:
			types.clear();
			types.add(Types.Water);
			return types;
		case Kingler:
			types.clear();
			types.add(Types.Water);
			return types;
		case Voltorb:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Electrode:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Exeggcute:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Psychic);
			return types;
		case Exeggutor:
			types.clear();
			types.add(Types.Grass);
			types.add(Types.Psychic);
			return types;
		case Cubone:
			types.clear();
			types.add(Types.Ground);
			return types;
		case Marowak:
			types.clear();
			types.add(Types.Ground);
			return types;
		case Hitmonlee:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Hitmonchan:
			types.clear();
			types.add(Types.Fighting);
			return types;
		case Lickitung:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Koffing:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Weezing:
			types.clear();
			types.add(Types.Poison);
			return types;
		case Rhyhorn:
			types.clear();
			types.add(Types.Ground);
			types.add(Types.Rock);
			return types;
		case Rhydon:
			types.clear();
			types.add(Types.Ground);
			types.add(Types.Rock);
			return types;
		case Chansey:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Tangela:
			types.clear();
			types.add(Types.Grass);
			return types;
		case Kangaskhan:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Horsea:
			types.clear();
			types.add(Types.Water);
			return types;
		case Seadra:
			types.clear();
			types.add(Types.Water);
			return types;
		case Goldeen:
			types.clear();
			types.add(Types.Water);
			return types;
		case Seaking:
			types.clear();
			types.add(Types.Water);
			return types;
		case Staryu:
			types.clear();
			types.add(Types.Water);
			return types;
		case Starmie:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Psychic);
			return types;
		case MrMime:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Scyther:
			types.clear();
			types.add(Types.Bug);
			types.add(Types.Flying);
			return types;
		case Jynx:
			types.clear();
			types.add(Types.Ice);
			types.add(Types.Psychic);
			return types;
		case Electabuzz:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Magmar:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Pinsir:
			types.clear();
			types.add(Types.Bug);
			return types;
		case Tauros:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Magikarp:
			types.clear();
			types.add(Types.Water);
			return types;
		case Gyarados:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Flying);
			return types;
		case Lapras:
			types.clear();
			types.add(Types.Water);
			types.add(Types.Ice);
			return types;
		case Ditto:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Eevee:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Vaporeon:
			types.clear();
			types.add(Types.Water);
			return types;
		case Jolteon:
			types.clear();
			types.add(Types.Electric);
			return types;
		case Flareon:
			types.clear();
			types.add(Types.Fire);
			return types;
		case Porygon:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Omanyte:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Water);
			return types;
		case Omastar:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Water);
			return types;
		case Kabuto:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Water);
			return types;
		case Kabutops:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Water);
			return types;
		case Aerodactyl:
			types.clear();
			types.add(Types.Rock);
			types.add(Types.Flying);
			return types;
		case Snorlax:
			types.clear();
			types.add(Types.Normal);
			return types;
		case Articuno:
			types.clear();
			types.add(Types.Ice);
			types.add(Types.Flying);
			return types;
		case Zapdos:
			types.clear();
			types.add(Types.Electric);
			types.add(Types.Flying);
			return types;
		case Moltres:
			types.clear();
			types.add(Types.Fire);
			types.add(Types.Flying);
			return types;
		case Dratini:
			types.clear();
			types.add(Types.Dragon);
			return types;
		case Dragonair:
			types.clear();
			types.add(Types.Dragon);
			return types;
		case Dragonite:
			types.clear();
			types.add(Types.Dragon);
			types.add(Types.Flying);
			return types;
		case Mewtwo:
			types.clear();
			types.add(Types.Psychic);
			return types;
		case Mew:
			types.clear();
			types.add(Types.Psychic);
			return types;
		default:
			return null;
		}	
	}

	public static Types getMoveTypes(Moves moves) {
		switch (moves) {
		case Barrage: case Bide: case Bind: case Bite: case BodySlam: case CometPunch: case Constrict: case Conversion: case Cut: case DefenceCurl: case Disable: case DizzyPunch: case DoubleSlap: case DoubleTeam: case DoubleEdge: case EggBomb: case Explosion: case Flash: case FocusEnergy: case FuryAttack: case FurySwipes: case Glare: case Growl: case Growth: case Guillotine: case Harden: case Headbutt: case HornAttack: case HornDrill: case HyperBeam: case HyperFang: case Leer: case LovelyKiss: case MegaKick: case MegaPunch: case Metronome: case Mimic: case Minimize: case PayDay: case Pound: case QuickAttack: case Rage: case RazorWind: case Recover: case Roar: case Scratch: case Screech: case SelfDestruct: case Sharpen: case Sing: case SkullBash: case Slam: case Slash: case Smokescreen: case SoftBoiled: case SonicBoom: case SpikeCannon: case Splash: case Stomp: case Strength: case Struggle: case Substitute: case SuperFang: case Supersonic: case Swift: case SwordsDance: case Tackle: case TailWhip: case TakeDown: case Thrash: case Transform: case TriAttack: case ViceGrip: case Whirlwind: case Wrap:
			return Types.Normal;
		case Ember: case FireBlast: case FirePunch: case FireSpin: case Flamethrower:
			return Types.Fire;
		case Bubble: case BubbleBeam: case Clamp: case Crabhammer: case HydroPump: case Surf: case WaterGun: case Waterfall: case Withdraw:
			return Types.Water;
		case Thunder: case ThunderPunch: case ThunderShock: case ThunderWave: case Thunderbolt:
			return Types.Electric;
		case Absorb: case LeechSeed: case MegaDrain: case PetalDance: case RazorLeaf: case SleepPowder: case SolarBeam: case Spore: case StunSpore: case VineWhip:
			return Types.Grass;
		case AuroraBeam: case Blizzard: case Haze: case IceBeam: case IcePunch: case Mist:
			return Types.Ice;
		case Counter: case DoubleKick: case HighJumpKick: case JumpKick: case KarateChop: case LowKick: case RollingKick: case SeismicToss: case Submission:
			return Types.Fighting;
		case Acid: case AcidArmor: case PoisonGas: case PoisonPowder: case PoisonSting: case Sludge: case Smog: case Toxic:
			return Types.Poison;
		case BoneClub: case Bonemerang: case Dig: case Earthquake: case Fissure: case SandAttack:
			return Types.Ground;
		case DrillPeck: case Fly: case Gust: case MirrorMove: case Peck: case SkyAttack: case WingAttack:
			return Types.Flying;
		case Agility: case Amnesia: case Barrier: case Confusion: case DreamEater: case Hypnosis: case Kinesis: case LightScreen: case Meditate: case Psybeam: case Psychic: case Psywave: case Reflect: case Rest: case Teleport:
			return Types.Psychic;
		case LeechLife: case PinMissile: case StringShot: case Twineedle:
			return Types.Bug;
		case RockSlide: case RockThrow:
			return Types.Rock;
		case ConfuseRay: case Lick: case NightShade:
			return Types.Ghost;
		case DragonRage:
			return Types.Dragon;			
		default:	
			return null;
		}
	}

	
}
