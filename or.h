/*
Tyler Spring
Project 2
CMSC 330 7381
This is the or class. Checks to see if left or right are true or false.
*/
class Or: public SubExpression
{
public:
    Or(Expression* left, Expression* right): SubExpression(left, right)
    {
    }
    int evaluate()
    {
        return left->evaluate() || right->evaluate();
    }
};
