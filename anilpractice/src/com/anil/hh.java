import java.util.Scanner;
class H
{
static Scanner s1=new Scanner(System.in);
String m1(String s)
{
return s;
}
static float m2(float a)
{
return a;
}
boolean m3(boolean b)
{
return b;
}
static long m4(long c)
{
return c;
}
public static void main(String[]args)
{
H obj=new H();
String s=s1.next();
String res=obj.m1(s);
System.out.println(res);
float a=s1.nextFloat();
float res1=m2(a);
System.out.println(res1);
boolean b=s1.nextBoolean();
boolean res2=obj.m3(b);
System.out.println(res2);
long c=s1.nextLong();
long res4=m4(c);
System.out.println(res4);
}
}
