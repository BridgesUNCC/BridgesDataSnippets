#include <string>
#include <iostream>
#include <fstream>

using namespace std;

/* Import Bridges and relevant data source */
#include "../bridges/Bridges.h"
#include "../bridges/DataSource.h"
#include "../bridges/data_src/GutenbergBook.h"

using namespace bridges;

/*
 * This is a simple driver to demonstrate connecting to Bridges and retrieving the Book data set.
 *
 * If you have created a BRIDGES account, make sure to initialize the bridges object as follows:
 *   Bridges::initialize(1, "999999999999", "MyBridgesName");
 *
 *  If you have not created an account, please visit https://bridges-cs.herokuapp.com/signup
 *
 *  If you need to get the latest BRIDGES source code, please visit http://bridgesuncc.github.io/
 *
 *  Created 2/19/18
 *
 * */
int main() {

	/* Initialize a Bridges connection with your credentials */
	Bridges::initialize(1, "999999999999", "MyBridgesName");

	/* Get a Vector of GutenbergBook objects from Bridges */
	vector<GutenbergBook> book_list = DataSource::getGutenbergBookData();

	/* Print the number of books */
	cout << "Number of books: " << book_list.size() << endl << endl;

	/* Print the title and author from each book */
	for (int k = 0; k < book_list.size(); k++) {
		GutenbergBook b = book_list.at(k);
		cout << "Title: " << b.getTitle() << endl
			<< "   Author: " << b.getAuthorName() << endl;
			// << "URL: " << b.getURL()  << endl
			// << "characters, words, sentences, difficult words:: " <<
			// 	b.getNumChars()  << "," << b.getNumWords() << ","  <<
			// 	b.getNumSentences()  << "," << b.getNumDifficultWords() << endl;
	}

	return 0;
}
