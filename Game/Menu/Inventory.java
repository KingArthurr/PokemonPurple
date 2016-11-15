package Menu;

import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import Items.MiscItem;
import Items.KeyItem;
import Items.BattleItem;
import Items.Pokeball;
import Items.TMHM;
import TextBasedGame.Game;

public class Inventory implements Serializable {

	private static final long serialVersionUID = -1809016293422194306L;
	
	public Map<Items.MiscItem.MiscItems,Integer> MiscItems = new HashMap<Items.MiscItem.MiscItems,Integer>();
	public Map<Items.KeyItem.KeyItems,Integer> KeyItems = new HashMap<Items.KeyItem.KeyItems,Integer>();
	public Map<Items.BattleItem.BattleItems,Integer> BattleItems = new HashMap<Items.BattleItem.BattleItems,Integer>();
	public Map<Items.Pokeball.Pokeballs,Integer> Pokeballs = new HashMap<Items.Pokeball.Pokeballs,Integer>();
	public Map<Items.TMHM.TMHMs,Integer> TMHMs = new HashMap<Items.TMHM.TMHMs,Integer>();

	public boolean battleItemUsed = false;
	public Pokeball UsedPokeball;
	
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Inventory:");
		boolean valid = false;
		while (valid == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("What Items do you want to see?");
			
			System.out.println("1: Miscellaneous Items");
			System.out.println("2: Battle Items");
			System.out.println("3: Pokeballs");
			System.out.println("4: TMs & HMs");
			System.out.println("5: Key Items");
			System.out.println("M: Exit");
			String input = Game.in.nextLine();
			switch (input) {
			case "1":
				menuMiscItems();
				break;
			case "2":
				menuBattleItems();
				break;
			case "3":
				menuPokeballs();
				break;
			case "4":
				menuTMHMs();
				break;
			case "5":
				menuKeyItems();
				break;
			case "m":
			case "M":
				valid = true;
				break;
			default:
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------");
				System.out.println("Invalid input");
			}
		}		
	}
	
	public void menuMiscItems() {
		boolean done = false;
		while(done == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Miscellaneous Items:");
			if (MiscItems.isEmpty()) {
				System.out.println("No items");
			} else {
				int i = 1;
				for (Entry<Items.MiscItem.MiscItems, Integer> entry : MiscItems.entrySet()) {
				System.out.println(i + ": " + entry.getKey().toString() + " x" + entry.getValue());
					i++;
				}
			}
			System.out.println("M: Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Which Miscellaneous Item do you want to use?");
			String input = Game.in.nextLine();
			if (input.toLowerCase().equals("m")) {
				done = true;
			} else {
				try {
					int inp = Integer.parseInt(input);
					if (inp <= 0 || inp > MiscItems.size()) {
						throw new NumberFormatException();
					} else {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("What do you want to do?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("1: Use");
						System.out.println("2: Info");
						System.out.println("3: Toss");
						System.out.println("M: Exit");
						MiscItem item = new MiscItem((Items.MiscItem.MiscItems) MiscItems.keySet().toArray()[inp-1]);
						input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (Game.player.isInBattle == false) {
								item.use(item);
							} else {
								int item1 = Game.inventory.MiscItems.get(item.miscitem);
								item.use(item);
								int item2 = Game.inventory.MiscItems.get(item.miscitem);
								if (item1 > item2) {
									battleItemUsed = true;
									return;
								}
							}
							break;
						case "2":
							item.info(item);
							break;
						case "3":
							if (Game.player.isInBattle == false) {
								item.toss(item);
							} else {
								System.out.println("You can't toss items in battle.");
							}
							break;
						case "m":
						case "M":
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input");
				}
			}
		}

	}
	
	public void addMiscItem(MiscItem item) {
		if (MiscItems.containsKey(item.miscitem)) {
			Integer value = MiscItems.get(item.miscitem) + 1;
			MiscItems.remove(item.miscitem);
			MiscItems.put(item.miscitem, value);
		} else {
			MiscItems.put(item.miscitem, 1);
		}
	}
	
	public void removeMiscItem(MiscItem item) {
		if (MiscItems.containsKey(item.miscitem)) {
			Integer value = MiscItems.get(item.miscitem) - 1;
			MiscItems.remove(item.miscitem);
			MiscItems.put(item.miscitem, value);
			if (MiscItems.get(item.miscitem) < 1) {
				MiscItems.remove(item.miscitem);
			}
		}
	}
	
	public void menuKeyItems() {
		boolean done = false;
		while(done == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Key Items:");
			if (KeyItems.isEmpty()) {
				System.out.println("No items");
			} else {
				int i = 1;
				for (Entry<Items.KeyItem.KeyItems, Integer> entry : KeyItems.entrySet()) {
				System.out.println(i + ": " + entry.getKey().toString());
					i++;
				}
			}
			System.out.println("M: Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Which Key Item do you want to use?");
			String input = Game.in.nextLine();
			if (input.toLowerCase().equals("m")) {
				done = true;
			} else {
				try {
					int inp = Integer.parseInt(input);
					if (inp <= 0 || inp > KeyItems.size()) {
						throw new NumberFormatException();
					} else {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("What do you want to do?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("1: Use");
						System.out.println("2: Info");
						System.out.println("M: Exit");
						KeyItem item = new KeyItem((Items.KeyItem.KeyItems) KeyItems.keySet().toArray()[inp-1]);
						input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (Game.player.isInBattle == false) {
								item.use(item);
							} else {
								int item1 = Game.inventory.KeyItems.get(item.keyitem);
								item.use(item);
								int item2 = Game.inventory.KeyItems.get(item.keyitem);
								if (item1 > item2) {
									battleItemUsed = true;
									return;
								}
							}
							break;
						case "2":
							item.info(item);
							break;
						case "m":
						case "M":
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
					//TODO action
				} catch (NumberFormatException e) {
					System.out.println("Invalid input");
				}
			}
		}
	}
	
	public void addKeyItem(KeyItem item) {
		if (KeyItems.containsKey(item.keyitem)) {
			Integer value = KeyItems.get(item.keyitem) + 1;
			KeyItems.remove(item.keyitem);
			KeyItems.put(item.keyitem, value);
		} else {
			KeyItems.put(item.keyitem, 1);
		}
	}
	
	public void removeKeyItem(KeyItem item) {
		if (KeyItems.containsKey(item.keyitem)) {
			Integer value = KeyItems.get(item.keyitem) - 1;
			KeyItems.remove(item.keyitem);
			KeyItems.put(item.keyitem, value);
			if (KeyItems.get(item.keyitem) < 1) {
				KeyItems.remove(item.keyitem);
			}
		}
	}

	public void menuBattleItems() {
		boolean done = false;
		while(done == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Battle Items:");
			if (BattleItems.isEmpty()) {
				System.out.println("No items");
			} else {
				int i = 1;
				for (Entry<Items.BattleItem.BattleItems, Integer> entry : BattleItems.entrySet()) {
				System.out.println(i + ": " + entry.getKey().toString() + " x" + entry.getValue());
					i++;
				}
			}
			System.out.println("M: Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Which medicine do you want to use?");
			String input = Game.in.nextLine();
			if (input.toLowerCase().equals("m")) {
				done = true;
			} else {
				try {
					int inp = Integer.parseInt(input);
					if (inp <= 0 || inp > BattleItems.size()) {
						throw new NumberFormatException();
					} else {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("What do you want to do?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("1: Use");
						System.out.println("2: Info");
						System.out.println("3: Toss");
						System.out.println("M: Exit");
						BattleItem item = new BattleItem((Items.BattleItem.BattleItems) BattleItems.keySet().toArray()[inp-1]);
						input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (Game.player.isInBattle == false) {
								item.use(item);
							} else {
								int item1 = Game.inventory.BattleItems.get(item.battleitem);
								item.use(item);
								int item2 = Game.inventory.BattleItems.get(item.battleitem);
								if (item1 > item2) {
									battleItemUsed = true;
									return;
								}
							}
							break;
						case "2":
							item.info(item);
							break;
						case "3":
							if (Game.player.isInBattle == false) {
								item.toss(item);
							} else {
								System.out.println("You can't toss items in battle.");
							}
							break;
						case "m":
						case "M":
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input");
				}
			}
		}

	}
	
	public void addBattleItem(BattleItem item) {
		if (BattleItems.containsKey(item.battleitem)) {
			Integer value = BattleItems.get(item.battleitem) + 1;
			BattleItems.remove(item.battleitem);
			BattleItems.put(item.battleitem, value);
		} else {
			BattleItems.put(item.battleitem, 1);
		}
	}
	
	public void removeBattleItem(BattleItem item) {
		if (BattleItems.containsKey(item.battleitem)) {
			Integer value = BattleItems.get(item.battleitem) - 1;
			BattleItems.remove(item.battleitem);
			BattleItems.put(item.battleitem, value);
			if (BattleItems.get(item.battleitem) < 1) {
				BattleItems.remove(item.battleitem);
			}
		}
		
	}
	
	public void menuPokeballs() {
		boolean done = false;
		while(done == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Pokeballs:");
			if (Pokeballs.isEmpty()) {
				System.out.println("No items");
			} else {
				int i = 1;
				for (Entry<Items.Pokeball.Pokeballs, Integer> entry : Pokeballs.entrySet()) {
				System.out.println(i + ": " + entry.getKey().toString() + " x" + entry.getValue());
					i++;
				}
			}
			System.out.println("M: Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Which item do you want to use?");
			String input = Game.in.nextLine();
			if (input.toLowerCase().equals("m")) {
				done = true;
			} else {
				try {
					int inp = Integer.parseInt(input);
					if (inp <= 0 || inp > Pokeballs.size()) {
						throw new NumberFormatException();
					} else {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("What do you want to do?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("1: Use");
						System.out.println("2: Info");
						System.out.println("3: Toss");
						System.out.println("M: Exit");
						Pokeball item = new Pokeball((Items.Pokeball.Pokeballs) Pokeballs.keySet().toArray()[inp-1]);
						input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (Game.player.isInBattle == false) {
								UsedPokeball = item.use(item);
							} else {
								int item1 = Game.inventory.Pokeballs.get(item.pokeball);
								item.use(item);
								int item2 = Game.inventory.Pokeballs.get(item.pokeball);
								if (item1 > item2) {
									battleItemUsed = true;
									return;
								}
							}
							break;
						case "2":
							item.info(item);
							break;
						case "3":
							if (Game.player.isInBattle == false) {
								item.toss(item);
							} else {
								System.out.println("You can't toss items in battle.");
							}
							break;
						case "m":
						case "M":
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input");
				}
			}
		}

	}
	
	public void addPokeball(Pokeball item) {
		if (Pokeballs.containsKey(item.pokeball)) {
			Integer value = Pokeballs.get(item.pokeball) + 1;
			Pokeballs.remove(item.pokeball);
			Pokeballs.put(item.pokeball, value);
		} else {
			Pokeballs.put(item.pokeball, 1);
		}
	}
	
	public void removePokeball(Pokeball item) {
		if (Pokeballs.containsKey(item.pokeball)) {
			Integer value = Pokeballs.get(item.pokeball) - 1;
			Pokeballs.remove(item.pokeball);
			Pokeballs.put(item.pokeball, value);
			if (BattleItems.get(item.pokeball) < 1) {
				BattleItems.remove(item.pokeball);
			}
		} 
	}

	public void menuTMHMs() {
		boolean done = false;
		while(done == false) {
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("TMs & HMs:");
			if (TMHMs.isEmpty()) {
				System.out.println("No items");
			} else {
				int i = 1;
				for (Entry<Items.TMHM.TMHMs, Integer> entry : TMHMs.entrySet()) {
				System.out.println(i + ": " + entry.getKey().toString() + " x" + entry.getValue());
					i++;
				}
			}
			System.out.println("M: Exit");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("Which item do you want to use?");
			String input = Game.in.nextLine();
			if (input.toLowerCase().equals("m")) {
				done = true;
			} else {
				try {
					int inp = Integer.parseInt(input);
					if (inp <= 0 || inp > TMHMs.size()) {
						throw new NumberFormatException();
					} else {
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("What do you want to do?");
						System.out.println(
								"--------------------------------------------------------------------------------------------------------------");
						System.out.println("1: Use");
						System.out.println("2: Info");
						System.out.println("3: Toss");
						System.out.println("M: Exit");
						TMHM item = new TMHM((Items.TMHM.TMHMs) TMHMs.keySet().toArray()[inp-1]);
						input = Game.in.nextLine();
						switch (input) {
						case "1":
							if (Game.player.isInBattle == false) {
								item.use(item);
							} else {
								int item1 = Game.inventory.TMHMs.get(item.tmhm);
								item.use(item);
								int item2 = Game.inventory.TMHMs.get(item.tmhm);
								if (item1 > item2) {
									battleItemUsed = true;
									return;
								}
							}
							break;
						case "2":
							item.info(item);
							break;
						case "3":
							if (Game.player.isInBattle == false) {
								item.toss(item);
							} else {
								System.out.println("You can't toss items in battle.");
							}
							break;
						case "m":
						case "M":
							break;
						default:
							System.out.println(
									"--------------------------------------------------------------------------------------------------------------");
							System.out.println("Invalid input");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input");
				}
			}
		}

	}
	
	public void addTMHM(TMHM item) {
		if (TMHMs.containsKey(item.tmhm)) {
			Integer value = TMHMs.get(item.tmhm) + 1;
			TMHMs.remove(item.tmhm);
			TMHMs.put(item.tmhm, value);
		} else {
			TMHMs.put(item.tmhm, 1);
		}
	}
	
	public void removeTMHM(TMHM item) {
		if (TMHMs.containsKey(item.tmhm)) {
			Integer value = TMHMs.get(item.tmhm) - 1;
			TMHMs.remove(item.tmhm);
			TMHMs.put(item.tmhm, value);
			if (TMHMs.get(item.tmhm) < 1) {
				TMHMs.remove(item.tmhm);
			}
		}
	}
	
}
