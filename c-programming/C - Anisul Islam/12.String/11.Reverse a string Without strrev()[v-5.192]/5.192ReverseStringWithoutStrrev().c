#include<stdio.h>
int main()
{
    int i=0, j=0, len=0;
    char str1[30];
    char str2[30];

    printf("Enter the String: ");
    gets(str1);

    printf("String = %s\n",str1);

    //Get str1[] length
    while(str1[i]!='\0')
    {
        len++;
        i++;
    }

    for(j=0, i=len-1; i>=0; i--,j++)
    {
        str2[j] = str1[i];
    }
    str2[j]='\0';

    printf("Reverse string = %s\n",str2);



    return 0;
}





