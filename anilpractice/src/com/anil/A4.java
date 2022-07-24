import java.util.*;
class A
{
static Scanner sc=new Scanner(System.in);
static A a1=new A();
static A m1(String s,int a,float f)
{
System.out.println(s+""+a+""+f);
return a1;
}
boolean m2(A a1)
{
System.out.println(a1);
return sc.nextBoolean();
}
public static void main(String[] args)
{
String s=sc.next();
int a=sc.nextInt();
float f=sc.nextFloat();
System.out.println(m1(s,a,f));
System.out.println(a1.m2(a1));
}
}