import java.util.*;
class A
{
static Scanner sc=new Scanner(System.in);
int m1(String s)
{
System.out.print(s);
int a=sc.nextInt();
return a;
}
static long m2(boolean b)
{
System.out.print(b);
long c=sc.nextLong();
return c;
}
public static void main(String[] args)
{
String s=sc.next();
System.out.print(new A().m1(s));
boolean b=sc.nextBoolean();
System.out.print(m2(b));
}
}
