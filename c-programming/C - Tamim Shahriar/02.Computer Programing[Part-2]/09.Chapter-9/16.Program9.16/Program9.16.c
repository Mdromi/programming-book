#include<stdio.h>

typedef int * ip;
typedef int a100[100];
typedef int (*fp) (int);

int main()
{
    ip a, b, c;  // a, b, c are integer pointers
    a100 p, q;   // p, q both are array of 100 integers
    fp f1, f2;   // f1, f2 both are pointers to functions
                 // which takes on integer parameter as input
                 // and returns an integer


    return 0;
}

