#include <stdio.h>
int main()
{

    double first,second,temp;
    printf("Enter first number : ");
    scanf("%lf",&first);
    printf("Enter second number :");
    scanf("%lf",&second);

    temp = first;

    first=second;

    second = temp;

    printf("\n After swapping,first number = %.2lf\n",first);
    printf("After swapping ,second number = %2.lf",second);
    return 0;
}
