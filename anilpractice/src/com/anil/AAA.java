import java.util.*;
class B
{
int a;
int b;
//System.out.print(a+""+b);
B(int c,int d)
{
a=c;
b=d;
System.out.print(c+""+d);
System.out.print(a+""+b);
}
B(B b1)
{
System.out.print(b1.a+""+b1.b);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
B a1=new B(sc.nextInt(),sc.nextInt());
B a3=new B(a1);
}
}