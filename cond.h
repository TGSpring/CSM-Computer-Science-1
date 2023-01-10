/*
Tyler Spring
Project 2
CMSC 330 7381
This is the cond class. Checks for conditional relation between left and right and looks at given conditional.
*/
class Cond: public SubExpression
{
public:
    Cond(Expression* left, Expression* right, Expression* condition): SubExpression(left, right, condition)
    {
    }
    int evaluate()
    {
        if (condition->evaluate()) {
            return left->evaluate();
        }
        return right->evaluate();
    }
};
