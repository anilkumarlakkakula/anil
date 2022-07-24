import java.util.*;
class Main
{
static Scanner s1=new Scanner(System.in);
static Main a1=new Main();
void m1(int a,String s,long b)
{
System.out.print(a+" "+s+" "+b+" ");
}


static boolean m2(double d,int i,char c)
{
System.out.print(d+" "+i+" "+c);
boolean r=s1.nextBoolean();
int a=s1.nextInt();
String s=s1.next();
long b=s1.nextLong();
a1.m1(a,s,b);
return r;
}


public static void main(String[] anil)
{
double d=s1.nextDouble();
int i=s1.nextInt();
char c=s1.next().charAt(0);
System.out.println(m2(d,i,c));
} 
}