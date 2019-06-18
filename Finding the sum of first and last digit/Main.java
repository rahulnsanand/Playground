#include <stdio.h>
int main() {
  int a;
  scanf("%d",&a);
  int first, last;
  first = a%10;
  int temp, count=10;
  temp = a;
  while(temp){
    count = count*10;
    temp = temp/10;
  }
  last = a/(count/100);
  printf("%d",first+last);
  return 0;
}