import java.util.Scanner;
class IS
{
void m1(int a,String b)
{
System.out.print(a+" "+b);
}
public static void main(String[] args)
{
IS a1=new IS();
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
String b=s1.next();
a1.m1(a,b);
}
}