import java.util.*;
class M
{
   static Scanner sc=new Scanner(System.in);
   static M a1=new M();
   static String m1(String s)
   {
    System.out.println(s);
    return sc.next();
   }
   String m2(String d)
  {
   System.out.println(d);
   return sc.next();
  }
   static String m3(String a,String b,String c,String f)
  {
   System.out.println(a+""+b+""+c+""+f);
   return sc.next();
  }
   public static void main(String[] args)
  {
  System.out.println (m3(sc.next(),sc.next(),sc.next(),a1.m2(m1(sc.next())))); 
  }
}