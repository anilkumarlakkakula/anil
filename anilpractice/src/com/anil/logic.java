import java.util.*;
class Logic
{
static Scanner s1=new Scanner(System.in);
int add(int a,int b)
{
return a+b;
}
int sub(int c,int d)
{
return c-d;
}
static int mul()
{
Logic a1=new Logic();
int a=s1.nextInt();
int b=s1.nextInt();
int res1=a1.add(a,b);
System.out.println("addition of 2 no's:"+res1);
int c=s1.nextInt();
int d=s1.nextInt();
int res2=a1.sub(c,d); 
System.out.println("subtraction of 2 no's"+res2);
return res1*res2;
}
public static void main(String[] anil)
{
System.out.print(mul());
}
}


