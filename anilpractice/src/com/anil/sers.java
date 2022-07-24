import java.util.*;
class Sers
{
public static void main(String[] anil)
{
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
int c=0;
for(int i=a;i<=b;i++)
{
c++;
if(c==1)
{
System.out.print(i+"*"+(i+1));
}
else
{
System.out.print(","+i+"*"+(i+1));
}
}
System.out.println();
c=0;
for(int i=a;i<=b;i++)
{
c++;
if(c==1)
{
System.out.print(i*(i+1));
}
else
{
System.out.print(","+i*(i+1));
}
}
}
}