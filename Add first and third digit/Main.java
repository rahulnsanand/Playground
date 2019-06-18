#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int first, third;
  first = a/100;
  third = a%10;
  int add = first + third;
  printf("%d", add);
  return 0;
}