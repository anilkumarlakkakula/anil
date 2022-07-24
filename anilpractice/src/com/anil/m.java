import java.util.Scanner;
class M
{
static Scanner sc=new Scanner(System.in);
static void m1(String s)
{
System.out.print(s);
}
void m2(int x,boolean y)
{
System.out.print(x+" "+y);
String sv=sc.next();
m1(sv);
}
static void m3(long c,float d,char e)
{
int iv=sc.nextInt();
boolean bv=sc.nextBoolean();
M obj=new M();
obj.m2(iv,bv);
System.out.print(c+" "+d+" "+e);
}
public static void main(String[]args)
{
long lv=sc.nextLong();
float fv=sc.nextFloat();
char cv=sc.next().charAt(0);
m3(lv,fv,cv);
}
}