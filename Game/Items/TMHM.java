package Items;

import java.io.Serializable;

import TextBasedGame.Game;

public class TMHM implements Serializable{

	private static final long serialVersionUID = -7872293855373682785L;

	public String name;
	public TMHMs tmhm;
	
	public TMHM(TMHMs TMHM) {
		name = TMHM.toString();
		tmhm = TMHM;
	}
	
	public enum TMHMs {
		HM01(1),HM02(2),HM03(3),HM04(4),HM05(5),TM01(6),TM02(7),TM03(8),TM04(9),TM05(10),
		TM06(11),TM07(12),TM08(13),TM09(14),TM10(15),TM11(16),TM12(17),TM13(18),TM14(19),TM15(20),
		TM16(21),TM17(22),TM18(23),TM19(24),TM20(25),TM21(26),TM22(27),TM23(28),TM24(29),TM25(30),
		TM26(31),TM27(32),TM28(33),TM29(34),TM30(35),TM31(36),TM32(37),TM33(38),TM34(39),TM35(40),
		TM36(41),TM37(42),TM38(43),TM39(44),TM40(45),TM41(46),TM42(47),TM43(48),TM44(49),TM45(50),
		TM46(51),TM47(52),TM48(53),TM49(54),TM50(55),TM51(56),TM52(57),TM53(58),TM54(59),TM55(60);
		public int tmhm;
		
		TMHMs(int t) {
			tmhm = t;
		}
	}

	public void use(TMHM item) {
		if (Game.player.isInBattle == false) {
			//TODO
		} else {
			System.out.println("You can't use this item right now");
		}
		
	}

	public void info(TMHM item) {
		// TODO Auto-generated method stub
		
	}

	public void toss(TMHM item) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("How many do you want to toss?");
		String input = Game.in.nextLine();
		int i = Integer.parseInt(input);
		if (i > 0 && i <= Game.inventory.TMHMs.get(item.tmhm)) {
			for (int j = 0; j < i; j++) {
				Game.inventory.removeTMHM(item);
			}
		} else {
			System.out.println("Invalid input!");
		}
	}
}
