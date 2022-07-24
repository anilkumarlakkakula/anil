import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
for(int i=a;i<=b;i++)
{
for(int j=1;j<=i;i++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
System.out.print(i+" ");
}
}
}
}