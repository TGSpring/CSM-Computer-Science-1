/*
Tyler Spring
Project 2
CMSC 330 7381
This is the literal class. Checks to see if the value variable is a literal. Assigns it as an integer.
*/
class Literal: public Operand
{
public:
    Literal(int value)
    {
        this->value = value;
    }
    int evaluate()
    {
        return value;
    }
private:
    int value;
};
