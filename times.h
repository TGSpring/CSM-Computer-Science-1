/*
Tyler Spring
Project 2
CMSC 330 7381
This is the times class. Multiplies the left and right.
*/
class Times : public SubExpression
{
public:
    Times(Expression* left, Expression* right): SubExpression(left,right)
    {


    }
    int evaluate()
    {

    return left->evaluate() * right->evaluate();
    }
};
