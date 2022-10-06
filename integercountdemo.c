#include <stdio.h>
int main()
{
    int count=0;
    long long n;
    printf("Enter an integer:");
    scanf("%lld",&n);

    do
    {
        n /= 10;
        ++count;
    }
    while(n!=0);

    printf("Number of digits %d",count);

}
