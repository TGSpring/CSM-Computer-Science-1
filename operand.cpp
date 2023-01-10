/*
Tyler Spring
Project 2
CMSC 330 7381
This is the operand class. Here operands that are found in the subExpression class
are passed to here to be evaluated and assigned.
*/
#include <cctype>
#include <iostream>
#include <list>
#include <string>

using namespace std;

#include "expression.h"
#include "subexpression.h"
#include "operand.h"
#include "variable.h"
#include "literal.h"
#include "parse.h"
#include <sstream>

Expression* Operand::parse(stringstream & in)
{
    //Passed variable is evaluated and decided if it is a literal, parenthesis, or a variable.
    char paren;
    int value;

    in >> ws;
    if (isdigit(in.peek()))
    {
        in >> value;
        Expression* literal = new Literal(value);
        return literal;
    }
    if (in.peek() == '(')
    {
        in >> paren;
        return SubExpression::parse(in);
    }
    else
        return new Variable(parseName(in));
    return 0;
}
