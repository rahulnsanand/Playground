#include <stdio.h>
int main() {
  int a,i,num;
  scanf("%d", &a);
  num=1;
  for(i = 1;i<=a;i++){
    num=num+i;
  }
      printf("%d\n",num-1);

  return 0;
}