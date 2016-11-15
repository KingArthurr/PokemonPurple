package Objects;

public class Computer implements Object {
	
	private static final long serialVersionUID = -2640437485448303211L;
	public String name = "computer";	
	
	@Override
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		if (pokemonstorage.isEmpty()) {
			System.out.println("No pokemon in storage!");
		} else {
			for (int i = 0; pokemonstorage.size() > i ; i++) {
				System.out.println(i+1 + ": " + pokemonstorage.get(i).name);
			}
		}
		System.out.println("The computer is turned off.");
	}

	@Override
	public Integer getInt(String integer) {
		switch (integer) {
		case "1":	return null;
		default:	return null;
		}
	}
	@Override
	public void setInt(String integer, Integer i) {
		switch(integer) {
		case "1":	return;
		default:	return;
		}
	}
	@Override
	public String getString(String string) {
		switch (string) {
		case "name":	return name;
		default:	return null;
		}
	}
	@Override
	public void setString(String string, String str) {
		switch(string) {
		case "name":	name = str;
		default:	return;
		}
	}
	@Override
	public Boolean getBoolean(String boolen) {
		switch (boolen) {
		case "1":	return null;
		default:	return null;
		}
	}
	@Override
	public void setBoolean(String boolen, Boolean bool) {
		switch(boolen) {
		case "1":	return;
		default:	return;
		}
	}
}
