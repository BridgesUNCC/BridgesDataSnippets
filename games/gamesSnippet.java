package games;

import java.util.List;
import java.util.Random;

/* Import Bridges and relevant data source */
import bridges.connect.Bridges;
import bridges.data_src_dependent.Game;

/*
 * This is a simple driver to demonstrate connecting to Bridges and retrieving the Game data set.
 *
 * If you have created a BRIDGES account, make sure to initialize the bridges object as follows:
 *   Bridges bridges = new Bridges(assignment_number, "API Key", "Username");
 *   For example:
 *   Bridges bridges = new Bridges(1, "999999999999", "MyBridgesName");
 *  
 *  
 *  If you have not created an account, please visit https://bridges-cs.herokuapp.com/signup
 *  
 *  If you need to get the latest BRIDGES JAR file, please visit http://bridgesuncc.github.io/
 *  
 *  Created 2/6/18
 *  
 * */
public class gamesSnippet {

	public static void main(String[] args) throws Exception {
		
		/* Initialize a Bridges connection with your credentials */
		Bridges bridges = new Bridges(1, "984588748448", "BridgesData");
		
		/* Get a List of Game objects from Bridges */
		List<Game> mylist = bridges.getGameData();
		
		/* Inspect a random Game object */
		Game game1 = mylist.get((new Random()).nextInt(mylist.size()));
		System.out.println(game1.getTitle());
		System.out.println(game1.getPlatformType());
		System.out.println(game1.getRating());
		System.out.println(game1.getGenre());
	}
}
