import java.util.*;
class B
{
B()
{
System.out.print("hi);
}
B(int a)
{
System.out.println(a);
}
B(long b,boolean c)
{
System.out.println(b+""+c);
}
B(B b1)
{
System.out.println(b1);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
long y=sc.nextLong();
boolean z=sc.nextBoolean();
B a1=new B();
B a2=new B(x);
B a3=new B(y,z);
B a4=new B(a1);
}
}