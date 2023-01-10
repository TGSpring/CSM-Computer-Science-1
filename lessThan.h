/*
Tyler Spring
Project 2
CMSC 330 7381
This is the less than class. Checks to see if left is less than right.
*/
class LessThan: public SubExpression
{
public:
    LessThan(Expression* left, Expression* right): SubExpression(left, right)
    {
    }
    int evaluate()
    {
        return left->evaluate() < right->evaluate();
    }
};
