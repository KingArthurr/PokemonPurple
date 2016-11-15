package Characters;

import java.io.Serializable;
import java.util.Scanner;

public interface Character extends Serializable {

	Scanner in = new Scanner(System.in);
	
	public void action();
	
	public Integer getInt(String integer);
	
	public void setInt(String integer, Integer i);
	
	public String getString(String string);
	
	public void setString(String string, String str);
	
	public Boolean getBoolean(String boolen);
	
	public void setBoolean(String boolen, Boolean bool);
	
}
