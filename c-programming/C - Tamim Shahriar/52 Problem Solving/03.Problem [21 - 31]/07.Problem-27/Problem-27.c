#include<stdio.h>
int main()
{
    int T, n, res, rem, temp;

    scanf("%d",&T);

    while(T--)
    {
        scanf("%d",&n);

        temp = n;
        res = 0;

        while(temp != 0)
        {
            rem = temp % 10;
            res += (rem*rem*rem);
            temp /= 10;
        }

        if(n == res)
        {
            printf("%d is an armstrong number!\n",n);
        }
        else
        {
            printf("%d is not an armstrong number!\n",n);
        }
    }


    return 0;
}

