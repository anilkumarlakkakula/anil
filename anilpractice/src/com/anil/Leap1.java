class Leapyear
{
public static void main(String[] anil)
{
int n=768;
if((n%400==0)||(n%4==0&&n%100!=0))
{
System.out.print("it is leap year");
}
else
{
System.out.print("not a leap year");
}
}
}