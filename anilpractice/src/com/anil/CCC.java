import java.util.*;
class C
{
static Scanner sc=new Scanner(System.in);

C()
{
System.out.print("HI");
}

C(int a)
{
System.out.print(a);
}

C(C c1)
{
System.out.print(c1);
}

static String m1(int b)
{
System.out.print(b);
String s=sc.next();
return s;
}

long m2(double d)
{
System.out.print(d);
long l=sc.nextLong();
return l;
}

public static void main(String[] args)
{
int a=sc.nextInt();
int b=sc.nextInt();
double d=sc.nextDouble();
C a1=new C();
C a2=new C(a);
C a3=new C(a1);
System.out.print(m1(b));
System.out.print(a1.m2(d));
}
}
