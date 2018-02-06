package books;

import java.util.List;
import java.util.Random;


/* Import Bridges and relevant data source */
import bridges.connect.Bridges;
import bridges.data_src_dependent.GutenbergBook;

/*
 * This is a simple driver to demonstrate connecting to Bridges and retrieving the Book data set.
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
public class booksSnippet {

	public static void main(String[] args) throws Exception {
		
		/* Initialize a Bridges connection with your credentials */
		Bridges bridges = new Bridges(1, "999999999999", "MyBridgesName");
		
		/* Get a List of GutenbergBook objects from Bridges */
		List<GutenbergBook> mylist = bridges.getGutenbergBookMetaData();
		
		/* Inspect a random GutenbergBook object */
		GutenbergBook book1 = mylist.get((new Random()).nextInt(mylist.size()));
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthorName());
		System.out.println(book1.getGenres());
		
	}
}
