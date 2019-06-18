#include<stdio.h>
int main()
{
  int a, last;
  scanf("%d", &a);
  last = (a%100)/10;
  printf("%d",last);
  return 0;
}