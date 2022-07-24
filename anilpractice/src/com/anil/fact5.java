import java.util.*;
class Fact5
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int i;
for(i=1;i<=n;i++)
{
if(i%2==1)
{
if(i%5==0)
{
System.out.print("factor of five"+",");
}
else
{
System.out.print(i+",");
}
}
}
}
}