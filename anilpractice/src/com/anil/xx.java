import java.util.*;
class X
{
int a=20;
void m1(int a)
{
System.out.println(a);
X x1=new X();
System.out.println(x1.a);
System.out.println(this.a);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
X obj=new X();
obj.m1(a);
}
}