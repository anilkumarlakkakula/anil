import java.util.*;
class E
{
static Scanner sc=new Scanner(System.in);
E(int a,long b)
{
System.out.print(a+""+b);
}

E(double d)
{

this(sc.nextInt(),sc.nextLong());
System.out.print(d);

}
 
E()
{

this(sc.nextDouble());
System.out.print("HI");

}
public static void main(String[] args)
{
E a1=new E();
}
}
