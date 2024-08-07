#include<stdio.h>

int is_balanced(char input[]) // {{([])}}
{
    char stack[100], last_char;
    int top, i, len;

    top = 0;
    len = strlen(input);

    for(i = 0; i < len; i++) // len = 4; i = 0
    {
        if(input[i] == '{' || input[i] == '(' || input[i] == '[')
        {
            switch(input[i])
            {
                case '{':
                stack[top] = '{';
                break;

                case '(':
                stack[top] = '(';
                break;

                case '[':
                stack[top] = '[';
                break;
            }
            top++; //top = 4
        }
        else if(input[i] == '}' || input[i] == ')' || input[i] == ']') // ()()
        {

            if(top == 0)
            {
                //stack empty
                return 0;
            }

            top--; // top = 0

            last_char = stack[top]; // last_char = stack[0] = {
            if(last_char != '{' && last_char != '(' && last_char != '[') //
            {
                printf("top = %d\n",top);
                return 0;
            }
        }
    }

    if(top == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    char input[100];

    scanf("%s", input);

    if(is_balanced(input))
    {
        printf("%s is balanced\n", input);
    }
    else
    {
        printf("%s is not balanced\n",input);
    }



    return 0;
}

