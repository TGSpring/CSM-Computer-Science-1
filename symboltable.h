/*
Tyler Spring
Project 2
CMSC 330 7381
This is the symbolTable class. Creates methods, insert, lookUp and init. These are used mainly in the other symbolTable class. But also in module3 when reading the input.
*/
class SymbolTable
{
public:
    SymbolTable() {}
    void insert(string variable, int value);
    int lookUp(string variable) const;
    void init();
private:
    struct Symbol
    {
        Symbol(string variable, int value)
        {
            this->variable = variable;
            this->value = value;
        }
        string variable;
        int value;
    };
    vector<Symbol> elements;
};
