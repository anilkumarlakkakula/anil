import java.util.Scanner;
class N
{
static Scanner s1=new Scanner(System.in);
int m1(String a)
{
System.out.print(a);
int x=s1.nextInt();
return x;
}
public static void main(String[]args)
{
N obj =new N();
String a=s1.next();
System.out.println(obj.m1(a));
}
}