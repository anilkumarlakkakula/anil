import java.util.*;
class Main
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sum=0,a=0;
  int h=n%100;
  while(n>0)
  {
    int r=n%100;
    n=n/10;
    {
      if(r%2==1)
      {
       if(r>h)
       h=r;
      }
    }
  }
  while(h>0)
  {
    a=h%10;
    h=h/10;
    sum=sum+a;
  }
 System.out.print(sum);
}
}