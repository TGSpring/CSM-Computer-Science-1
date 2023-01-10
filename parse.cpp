/*
Tyler Spring
Project 2
CMSC 330 7381
This is the parse class. Not much happens here besides the current object being parsed
is passed here and is being added to the name string.
*/
#include <cctype>
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

#include "parse.h"

string parseName(stringstream & in)
{
    char alnum;
    string name = "";

    in >> ws;
    while (isalnum(in.peek()))
    {
        in >> alnum;
        name += alnum;
    }
    return name;
}
