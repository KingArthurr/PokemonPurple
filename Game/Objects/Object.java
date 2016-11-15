package Objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pokemons.Pokemon;

public interface Object extends Serializable {

	Scanner in = new Scanner(System.in);
	public List<Pokemon> pokemonstorage = new ArrayList<Pokemon>();
	
	public void action();
	
	public Integer getInt(String integer);
	
	public void setInt(String integer, Integer i);
	
	public String getString(String string);
	
	public void setString(String string, String str);
	
	public Boolean getBoolean(String boolen);
	
	public void setBoolean(String boolen, Boolean bool);

}