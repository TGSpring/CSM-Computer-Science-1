/*
Tyler Spring
Project 2
CMSC 330 7381
This is the Divide class. Divides the right expression from the left.
*/
class Divide : public SubExpression
{

public:
    Divide(Expression* left, Expression* right): SubExpression(left, right)
    {


    }
    int evaluate()
    {
    return left->evaluate() / right-> evaluate();
    }
};
