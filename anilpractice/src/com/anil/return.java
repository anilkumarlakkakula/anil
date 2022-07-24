import java.util.Scanner;
class R
{
static Scanner sc=new Scanner(System.in);
int display(int a)
{
return a;
}
public static void main(String[]args)
{
 R obj=new R();
int iv=sc.nextInt();
int res=obj.display(iv);
System.out.print(res);
}
}