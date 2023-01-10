/*
Tyler Spring
Project 2
CMSC 330 7381
This is the greater than class. Checks to see if left is greater than right.
*/
class GreaterThan: public SubExpression
{
public:
    GreaterThan(Expression* left, Expression* right): SubExpression(left, right)
    {
    }
    int evaluate()
    {
        return left->evaluate() > right->evaluate();
    }
};
