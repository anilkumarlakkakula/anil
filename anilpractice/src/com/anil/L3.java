import java.util.Scanner;
class L3
{
static Scanner sc=new Scanner(System.in);
boolean m1(float a)
{
System.out.print(a);
boolean b=sc.nextBoolean();
return b;
}
static char m2(double d)
{
System.out.print(d);
char c=sc.next().charAt(0);
return c;
}
long m3(String s)
{
System.out.print(s);
long l=sc.nextLong();
return l;
}
public static void main(String[] args)
{
L3 a1=new L3();
float f=sc.nextFloat();
System.out.print(a1.m1(f));
double d=sc.nextDouble();
System.out.print(m2(d));
String s=sc.next();
System.out.print(a1.m3(s));
}
}