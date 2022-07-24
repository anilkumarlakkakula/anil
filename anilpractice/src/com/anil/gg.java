import java.util.Scanner;
class G
{
static Scanner s1=new Scanner(System.in);
static G obj=new G();
boolean m1(int a)
{
System.out.print(a);
boolean b=s1.nextBoolean();
return b;
}
static int m2(String s)
{
System.out.print(s);
int c=s1.nextInt();
int a=s1.nextInt();
System.out.print(obj.m1(a));
return c;
}
char m3(long d)
{
System.out.print(d);
char e=s1.next().charAt(0);
String s=s1.next();
System.out.print(m2(s));
return e;
}
static String m4(double f)
{
System.out.print(f);
String g=s1.next();
long d=s1.nextLong();
System.out.print(obj.m3(d));
return g;
}
public static void main(String[]args)
{
double f=s1.nextDouble();
System.out.print(m4(f));
}
}