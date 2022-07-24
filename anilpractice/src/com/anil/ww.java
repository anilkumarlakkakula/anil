import  java.util.*;
class W
{
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
for(int i=a;i<=b;i++)
{
if(i%100==0)
{
System.out.print(i+",");
}
}
}
}