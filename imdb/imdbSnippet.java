package imdb;

import java.util.List;
import java.util.Random;


/* Import Bridges and relevant data source */
import bridges.connect.Bridges;
import bridges.data_src_dependent.ActorMovieIMDB;

/*
 * This is a simple driver to demonstrate connecting to Bridges and retrieving the Shakespeare data set.
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
public class imdbSnippet {

	public static void main(String[] args) throws Exception {
		
		/* Initialize a Bridges connection with your credentials */
		Bridges bridges = new Bridges(1, "984588748448", "BridgesData");
		
		/* Get a List of ActorMovieIMDB objects from Bridges */
		List<ActorMovieIMDB> mylist = bridges.getActorMovieIMDBData("imdb", Integer.MAX_VALUE);
		
		/* Inspect a random ActorMovieIMDB object */
		ActorMovieIMDB pair1 = mylist.get((new Random()).nextInt(mylist.size()));
		System.out.println(pair1.getActor());
		System.out.println(pair1.getMovie());
		
	}
}
