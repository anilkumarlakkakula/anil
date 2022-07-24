import java.util.*;
class Pzero
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
float a=s1.nextFloat();
float b=s1.nextFloat();
double i;
for(i=a;i<=b;)
{
System.out.printf("%.1f",i);
System.out.print("^"+"2"+",");
i=i+0.2;

}
}
}