import java.util.Scanner;
class Y
{
static void m1(double d)
{
System.out.print(d);
}
void m2(int i)
{
System.out.print(i);
}
static void m3(long l)
{
System.out.print(l);
}
public static void main(String[] anil)
{
Y obj=new Y();
Scanner s1=new Scanner(System.in);
System.out.print("enter value of double");
System.out.print("enter value of int");
System.out.print("enter value of long");
double d=s1.nextDouble();
int i=s1.nextInt();
long l=s1.nextLong();
m1(d);
obj.m2(i);
m3(l);
}
}
