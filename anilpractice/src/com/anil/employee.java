import java.util.*;
class Employee
{
static Scanner s1=new Scanner(System.in);
static Employee a1=new Employee();
void display(String empid,String empname,double empsalary,String empdesignation,String emplocation)
{
System.out.println("employee id: "+empid);
System.out.println("employee name: "+empname);
System.out.println("employee salary: "+empsalary);
System.out.println("employee designation: "+empdesignation);
System.out.println("employee location: "+emplocation);
}  
public static void main(String[] anil)
{
String a=s1.next();
String b=s1.next();
double c=s1.nextDouble();
String d=s1.next();
String e=s1.next();
a1.display(a,b,c,d,e);
}
}