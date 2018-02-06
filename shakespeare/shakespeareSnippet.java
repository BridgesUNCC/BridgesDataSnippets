package shakespeare;

import java.util.List;
import java.util.Random;


/* Import Bridges and relevant data source */
import bridges.connect.Bridges;
import bridges.data_src_dependent.Shakespeare;

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
public class shakespeareSnippet {

	public static void main(String[] args) throws Exception {
		
		/* Initialize a Bridges connection with your credentials */
		Bridges bridges = new Bridges(1, "984588748448", "BridgesData");
		
		/* Get a List of Shakespeare objects from Bridges */
		List<Shakespeare> mylist = bridges.getShakespeareData();
		
		/* Inspect a random Shakespeare object */
		Shakespeare work1 = mylist.get((new Random()).nextInt(mylist.size()));
		System.out.println(work1.getTitle());
		System.out.println(work1.getType());
		System.out.println(work1.getText());
		
	}
}
