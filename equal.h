/*
Tyler Spring
Project 2
CMSC 330 7381
This is the equal class. Checks to see if left and right are equal to each other.
*/
class Equal: public SubExpression
{
public:
    Equal(Expression* left, Expression* right): SubExpression(left, right)
    {
    }
    int evaluate()
    {
        return left->evaluate() == right->evaluate();
    }
};
