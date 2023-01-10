/*
Tyler Spring
Project 2
CMSC 330 7381
This is the subExpress class. Creates the three methods found in the other subexpression class and makes them static so they can be accessed elsewhere.
*/
class SubExpression: public Expression
{
public:
    SubExpression(Expression* left, Expression* right);
    SubExpression(Expression* left, Expression* right, Expression* condition);
    SubExpression(Expression* left);
    static Expression* parse(stringstream & in);
protected:
    Expression* left;
    Expression* right;
    Expression* condition;
};
