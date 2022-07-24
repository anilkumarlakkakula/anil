import java.util.*;
class Table
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("choose your limit");
int a=sc.nextInt();
System.out.println("choose your table");
int b=sc.nextInt();
int c;
for(int i=1;i<=a;i++)
{
c=b*i;
System.out.println(b+"*"+i+"="+(c));
}
}
}