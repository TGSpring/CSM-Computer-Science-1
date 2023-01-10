/*
Tyler Spring
Project 2
CMSC 330 7381
This is the symbolTable class. Here an object of the class is created in order to store the elements
that I read in from the file. From here they are pushed into a vector that is holding the elements.
*/
#include <string>
#include <vector>
using namespace std;

#include "symboltable.h"


void SymbolTable::insert(string variable, int value)
{
    //symbol object made to hold variable and value.
    const Symbol& symbol = Symbol(variable, value);
    elements.push_back(symbol);
}

int SymbolTable::lookUp(string variable) const
{
    //Loop to iterate through elements of vector.
    for (int i = 0; i < elements.size(); i++)
        if (elements[i].variable == variable)
             return elements[i].value;
    return -1;
}
void SymbolTable::init()
{
    elements.clear();
}
