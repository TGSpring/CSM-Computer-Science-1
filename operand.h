/*
Tyler Spring
Project 2
CMSC 330 7381
This is the operand class. Makes input from file read in static.
*/
class Operand: public Expression
{
public:
    static Expression* parse(stringstream & in);
};
