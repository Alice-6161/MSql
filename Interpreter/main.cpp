#include "antlr4-runtime.h"
#include "MSqlLexer.h"
#include "MSqlParser.h"
#include "MSqlParserBaseListener.h"
#include <iostream>
#include <fstream>
#include <string>

using namespace std;
using namespace antlr4;

int main() {
    // cout << "here" << endl;
    // string line;
    // ifstream SqlFile("test.txt");
    // if ( SqlFile.is_open() ) {

    //     // MSqlParserBaseListener listener;
    //     // tree::ParseTreeWalker::DEFAULT.walk( &listener, parser.expression() );
        
    //     SqlFile.close();
    // }
    /* Instantiate the input command */
    string command = "select * from t1, t2 where t1.id = t2.id and wxk = \"wxk\";";
    ANTLRInputStream input( command );
    /* Instantiate the lexer */
    MSqlLexer lexer( &input );
    /* Instantiate the tokens */
    CommonTokenStream tokens( &lexer );
    /* Instantiate the parser */
    MSqlParser parser( &tokens );
    tree::ParseTree* tree = parser.sqlStatements();
    
    /* Instantiate the tree walker */
    MSqlParserBaseListener listener;
    tree::ParseTreeWalker::DEFAULT.walk( &listener, tree );
    return 0;
}

// 330184200106224113