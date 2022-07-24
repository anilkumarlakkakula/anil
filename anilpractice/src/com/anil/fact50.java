import java.util.*;
class Fact50
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int i;
for(i=1;i<=n;i++)
{
if(i%10==0)
{
if(i==50)
{
System.out.print("Oh! I got fifty"+",");
}
else
{
System.out.print(i+",");
}
}
}
}
}