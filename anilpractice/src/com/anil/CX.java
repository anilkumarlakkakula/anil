import java.util.Scanner;
class X
{
void m1(int a)
{
System.out.print("value of a:"+a);  
}
public static void main(String[]args)
{
X obj=new X();
Scanner s1=new Scanner(System.in);
System.out.print("enter value of int");
int iv=s1.nextInt();
obj.m1(iv);
}
}  