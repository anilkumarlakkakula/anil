import java.util.*;
class F
{
static Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int m1(String s)
{
System.out.print(s);
System.out.print(this.a);
return sc.nextInt();
}

int m1(boolean b)
{
System.out.print(b);
System.out.print(this.m1(sc.next()));
return sc.nextInt();
}


F(long l)
{
System.out.print(l);
System.out.print(this.m1(sc.nextBoolean()));
}

F()
{
this(sc.nextLong());
System.out.print("HI");
}

public static void main(String[] args)
{
F a1=new F();
}
}