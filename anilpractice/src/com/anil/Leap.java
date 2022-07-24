class Leapyear
{
public static void main(String[] args)
{
int n=500;
if(n%4==0)
 {
  if(n%100==0)
   {
    if(n%400==0)
     {
      System.out.print("it is leap year");
     }
     else
     {
     System.out.print("not a leap year");
     }
   }
  else
  {
  System.out.print("it is leap year");
  }
 }
else
{
System.out.print("not a leap year");
}
}
}