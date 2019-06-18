#include<stdio.h>
int main()
{
  int a;
  scanf("%d", &a);
  int first, last;
  first = a/10;
  last = a%10;
  int sum = first +last;
  printf("%d", sum);
  return 0;
}