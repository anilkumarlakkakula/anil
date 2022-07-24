import java.util.*;
class Main
{
static Scanner sc=new Scanner(System.in);
static Main a1=new Main();
void m1()
{
System.out.println("ntg");
}

static void m2()
{
System.out.println("ntg 1");
a1.m1();
}

int m3()
{
System.out.println("ntg 2");
int a=sc.nextInt();
m2();
return a;
}

static float m4()
{
System.out.println("ntg 3");
float b=sc.nextFloat();
System.out.println(a1.m3());
return b;
}

void m5(String s)
{
System.out.println(s);
System.out.println(m4());
}

static void m6(long l)
{
System.out.print(l);
String s=sc.next();
a1.m5(s);
}

boolean m7(char c)
{
System.out.println(c);
boolean d=sc.nextBoolean();
long l=sc.nextLong();
m6(l);
return d;
}

static double m8(boolean e)
{
System.out.println(e);
double f=sc.nextDouble();
char c=sc.next().charAt(0);
System.out.println(a1.m7(c));
return f;
}


public static void main(String[] args)
{
boolean e=sc.nextBoolean();
System.out.println(m8(e));
}
}




