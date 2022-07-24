import java.util.Scanner;
class A7
{
static Scanner sc=new Scanner(System.in);
String m1(float f)
{
System.out.println(f);
return sc.next();
}
static float m2(int i)
{
System.out.println(i);
return sc.nextFloat();
}
boolean m3(double d)
{
System.out.println(d);
return sc.nextBoolean();
}
static long m4(String s)
{
System.out.println(s);
return sc.nextLong();
}
public static void main(String[] rags)
{
A7 a1=new A7();
float f=sc.nextFloat();
int i=sc.nextInt();
double d=sc.nextDouble();
String s=sc.next();
System.out.println(a1.m1(f));
System.out.println(m2(i));
System.out.println(a1.m3(d));
System.out.println(m4(s));
}
}