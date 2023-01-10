/*
Tyler Spring
Project 2
CMSC 330 7381
This is the subexpression class. Where module 3 is the main driver for reading the file. This
is where all the calculations for what each element contains is done.
Their are 3 different methods for 3 different kinds of operations.
One has just the left and right for the basic algebraic calculations.
Another has left, right, and conditional. This is for the relational operations.
From that method it is able to compare the relationship between two elements based on what
relational operator it finds.
The third method looks for just left. This is just for the negation or if their is a :,
then the program checks for a conditional which then reverts back to the previously mentioned method.
*/
#include <iostream>
using namespace std;

#include "expression.h"
#include "subexpression.h"
#include "operand.h"
#include "plus.h"
#include "minus.h"
#include "times.h"
#include "divide.h"
#include "and.h"
#include "or.h"
#include "greaterThan.h"
#include "lessThan.h"
#include "cond.h"
#include "negate.h"
#include "equal.h"
#include <sstream>
//First method for plus, minus, divide, and times.
SubExpression::SubExpression(Expression* left, Expression* right)
{
    this->left = left;
    this->right = right;
}
//Second method for greater than, less than, and, or, equal to.
SubExpression::SubExpression(Expression *left, Expression *right, Expression *condition)
{
    this->left = left;
    this->right = right;
    this->condition = condition;
}
//Third, just checks for negation, then to conditional, to go back to the second.
SubExpression::SubExpression(Expression* left)
{
    this->left = left;
}
//Is passed current string and element read in from file in module3.
Expression* SubExpression::parse(stringstream & in)
{
    Expression* left;
    Expression* right;
    Expression* condition;
    char operation, paren, quest;

    left = Operand::parse(in);
    in >> operation;
    if (operation == '!')
        {
        in >> paren;
        //negation check
        return new Negate(left);
        }
        //conditional check
        else if (operation == ':')
        {
            right = Operand::parse(in);
            in >> quest;
            condition = Operand::parse(in);
            in >> paren;
            //then back to second.
            return new Cond(left, right, condition);
        }
        else
            {
        right = Operand::parse(in);
        in >> paren;
        }
    switch (operation)
    //Switch statement that was provided, added to in order to do added calculations.
    {
        case '+':
            return new Plus(left, right);
        case '-':
            return new Minus(left, right);
        case '*':
            return new Times(left, right);
        case '/':
            return new Divide(left, right);
        case '>':
            return new GreaterThan(left, right);
        case '<':
            return new LessThan(left, right);
        case '=':
            return new Equal(left, right);
        case '&':
            return new And(left, right);
        case '|':
            return new Or(left, right);
    }
    return 0;
}
