import java.util.*;
class Task
{
public static void main(String[]anil)
{
Scanner s1=new Scanner(System.in);
int i=s1.nextInt();
if(i>=100&&i<1000)
{
if(i%2==0)
{
i=i%3;
System.out.print(i);
}
else
{
System.out.print("odd");
}
}
else
{
System.out.print("wrong number");
}
}
}