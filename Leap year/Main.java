#include<stdio.h>
int main()
{
  int a ;
  scanf("%d", &a);
  if(a%400==0){
    printf("Leap year");
  }
  if(a%100==0){
    printf("Not Leap year");
  }
  if(a%4==0){
    printf("Leap year");
  }
  else{
    printf("Not Leap year");
  }
  return 0;
}