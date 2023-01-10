/*
Tyler Spring
Project 2
CMSC 330 7381
This is the minus class. Subtracts the right from the left.
*/
class Minus : public SubExpression
{

public:
    Minus(Expression* left, Expression* right): SubExpression(left,right)
    {


    }
    int evaluate()
    {
    return left -> evaluate() - right ->evaluate();
    }
};
