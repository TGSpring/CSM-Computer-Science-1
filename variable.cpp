/*
Tyler Spring
Project 2
CMSC 330 7381
This is the variable class. Here just the symbolTable object is extended to be used with
the evaluate method of this class for other calculations.
*/
#include <strstream>
#include <vector>
using namespace std;

#include "expression.h"
#include "operand.h"
#include "variable.h"
#include "symboltable.h"

extern SymbolTable symbolTable;
//When making this, guess who did not understand what an extra qualification error meant?
//Now guess who spend an entire day teaching themselves that and C++?
int Variable::evaluate()
{
    return symbolTable.lookUp(name);
}
