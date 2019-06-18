#include <stdio.h>
int main() {
  int a,i,num;
  scanf("%d", &a);
  num=1;
  for(i = 1;i<=a;i++){
   
    printf("%d\n",num);
     num=num+2;
  }
  return 0;
}