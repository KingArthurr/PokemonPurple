package Objects;

public class TV implements Object {

	private static final long serialVersionUID = -4047287128458605919L;
	public String name = "TV";

	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		double tv = Math.random();
		if (tv <= .05) {
			System.out.println("The TV is turned on!");
			System.out.println("There is something about the Pokemon League on.");
			System.out.println("Wait! Isn't that Dad???");
		} else {
			System.out.println("The TV is turned off!");
		}
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
