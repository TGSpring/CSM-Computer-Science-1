/*
Tyler Spring
Project 2
CMSC 330 7381
This is the negate class. Checks to see if the selected element is a negation. Assigns it to left.
*/
class Negate: public SubExpression
{
public:
    Negate(Expression* left): SubExpression(left)
    {
    }
    int evaluate()
    {
        return !left->evaluate();
    }
};
