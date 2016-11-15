package Objects;

public class Bed implements Object {

	private static final long serialVersionUID = -8841331518492407332L;
	public String name = "Bed";
	
	@Override
	public void action() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.println("Hmm cozy...  Zzzz Zzzz Zzzz");
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
