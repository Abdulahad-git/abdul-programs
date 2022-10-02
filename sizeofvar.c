#include <stdio.h>;
int main()
{

    int intype;
    float floatype;
    char chartype;
    double doubletype;

    printf("Size of int = %zu bytes\n",sizeof(intype));
    printf("Size of float = %zu bytes\n",sizeof(floatype));
    printf("Size of double = %zu bytes\n",sizeof(doubletype));
    printf("Size of char = %zu bytes\n",sizeof(chartype));

    return 0;
}
