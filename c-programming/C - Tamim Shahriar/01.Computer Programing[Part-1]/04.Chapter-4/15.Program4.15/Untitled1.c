#include <stdio.h>

int main() {

    /**
     * Escreva a sua solu��o aqui
     * Code your solution here
     * Escriba su soluci�n aqu�
     */
 int a,b,c,MaiorAB,major;
 scanf("%d %d %d",&a,&b,&c);
 MaiorAB = (a+b+abs(a-b))/2;
 major = (MaiorAB+c+abs(MaiorAB-c))/2;
 printf("%d eh o maior\n",major);
    return 0;
}
