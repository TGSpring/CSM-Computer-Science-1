/*
Tyler Spring
Project 2
CMSC 330 7381
This is the and class. Checks for AND relationship between left and right.
*/
class And: public SubExpression
{
public:
    And(Expression* left, Expression* right): SubExpression(left, right)
    {
    }
    int evaluate()
    {
        return left->evaluate() && right->evaluate();
    }
};
