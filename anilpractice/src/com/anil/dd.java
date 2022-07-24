import java.util.*;
class D
{
static Scanner s1=new Scanner(System.in);
boolean m1(float a)
{
System.out.print(a);
boolean b=s1.nextBoolean();
return b;
}
static double m2(char c)
{
System.out.print(c);
double d=s1.nextDouble();
return d;
}
String m3(long e)
{
System.out.print(e);
String s=s1.next();
return s;
}
public static void main(String[] anil)
{
D obj=new D();
float a=s1.nextFloat();
System.out.print(obj.m1(a));
char c=s1.next().charAt(0);
System.out.print(m2(c));
long e=s1.nextLong();
System.out.print(obj.m3(e));
}
}

