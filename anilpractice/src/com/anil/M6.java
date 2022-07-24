import java.util.*;
class M6
{
static Scanner sc=new Scanner(System.in);
static M6 a1=new M6();

String m1(float a)
{
System.out.print(a);
String s=sc.next();
return s;
}

static boolean m2(String s)
{
System.out.print(s);
boolean b=sc.nextBoolean();
return b;
}

boolean m3(double d)
{
System.out.print(d);
float f=sc.nextFloat();
String s=a1.m1(f);
boolean b=m2(s);
return b;
}

public static void main(String[] args)
{
System.out.println("enter the value");
double d=sc.nextDouble();
System.out.println(a1.m3(d));
}
}