import java.util.*;
class Fact3
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int i;
int c=0;
for(i=1;i<=n;i++)
{
if(i%3==0)
{
System.out.print("factor of three"+",");
}
else
{
System.out.print(i+",");
}
}
}
}