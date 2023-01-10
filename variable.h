/*
Tyler Spring
Project 2
CMSC 330 7381
This is the variable class. This is where I had the error of extra qualification and not realizing I just needed to remove the name
"Variable" from the evaluate declaration, because it was right in front of me of course I could not see it.
*/
#include <sstream>
#include <vector>
using namespace std;
class Variable: public Operand
{
public:
    Variable(string name)
    {
        this->name = name;
    }
    int evaluate();

private:

string name;

};
