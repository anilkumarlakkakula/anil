import java.util.*;
class Con1
{
Con1()
{
System.out.print("hlo");
}
Con1(int a)
{
System.out.print(a);
}
Con1(float b,boolean c)
{
System.out.print(b+""+c);
}
Con1(char d,long e,double f)
{
System.out.print(d+""+e+""+f);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
float b1=sc.nextFloat();
boolean c1=sc.nextBoolean();
char d1=sc.next().charAt(0);
long e1=sc.nextLong();
double f1=sc.nextDouble();
Con1 a1=new Con1();
Con1 a2=new Con1(a);
Con1 a3=new Con1(b1,c1);
Con1 a4=new Con1(d1,e1,f1);
}
}