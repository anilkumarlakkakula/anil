import java.util.*;
class D
{
static Scanner sc=new Scanner(System.in);
int m1(String s)
{
System.out.print(s);
int i=sc.nextInt();
return i;
}

long m1(boolean b)
{
System.out.print(this.m1(sc.next()));

System.out.print(b);
long l=sc.nextLong();
return l;
}

char m1(double d)
{
System.out.print(this.m1(sc.nextBoolean()));
System.out.print(d);
char c=sc.next().charAt(0);
return c;
}

public static void main(String[] args)
{
D a1=new D();
System.out.print(a1.m1(sc.nextDouble()));
}
}