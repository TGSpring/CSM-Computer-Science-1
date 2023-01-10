/*
Tyler Spring
Project 2
CMSC 330 7381
This is the second project of our class. Here, the given the code was modified in order to
read the input from a given file, read the syntax of the file, and
perform the proper calculations on it and display the output.
Here the functions for Minus,Times, Divide were first added.
After that was completed, relational operators were added, as was the ability to read
the file name "input".
This is basically the main driver/method of the programs. Once the program is
built and ran it will find and read in the input file and begin
parsing the elements of the file here. Where it is then passed to the parse class.
*/
#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>
using namespace std;

#include "expression.h"
#include "subexpression.h"
#include "symboltable.h"
#include "parse.h"

SymbolTable symbolTable;

void parseAssignments(stringstream& in);

int main()
{
/*Expression, paren, and comma are created here, as well as the string placeholder
and the opening/reading of the file.*/
    Expression* expression;
    char paren, comma;
    string program;
    ifstream fin("input.txt");
//Here is where the string is read in and assigned to expression. From there it is passed to parse.
    while(getline(fin,program))
    {
        symbolTable.init();
        if(!fin)
            break;
        stringstream in(program, ios_base::in);
        in >> paren;
        cout <<program<<"";
        expression = SubExpression::parse(in);
        in >> comma;
        parseAssignments(in);
        cout<<" Output = " << expression->evaluate() << endl;
    }
    return 0;
}
/*Here is the parsing method that assigns the current element to a string, said string is passed to parse class
added to symboltable object.*/
void parseAssignments(stringstream & in)
{
    char assignop, delimiter;
    string variable;
    int value;
    symbolTable.init();
    do
    {
        variable = parseName(in);
        in >> ws >> assignop >> value >> delimiter;
        symbolTable.insert(variable, value);
    }
    while (delimiter == ',');
}


