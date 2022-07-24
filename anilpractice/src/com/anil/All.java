import java.util.Scanner;
class A 
{
static void m1(String a)
{
System.out.print(a);
}
void m2(int b,boolean c)
{
System.out.print(" "+b+" "+c);
}
static void m3(long d,float e,char f)
{
System.out.print(" "+d+" "+e+" "+f);
}
public static void main(String[]args)
{
Scanner s1=new Scanner(System.in);
A a1=new A();
String a=s1.next();
int b=s1.nextInt();
boolean c=s1.nextBoolean();
long d=s1.nextLong();
float e=s1.nextFloat(); 
char f=s1.next().charAt(0);
m1(a);
a1.m2(b,c);
m3(d,e,f);
}
}