#include <stdio.h>
int getdigit(int num, int n)
{
    int r, t1, t2;
 
    t1 = pow(10, n+1);
    r = num % t1;
 
    if (n > 0)
    {
        t2 = pow(10, n);
        r = r / t2;
    }
 
    return r;
}
 
void main()
{
  
  
  int num = 0;
  scanf("%d", &num);
  int count=0;
  int temp = num;
  while(temp){
    count = count+1;
    temp=temp/10;
  }
    printf("%d", getdigit(num, count-2));
}