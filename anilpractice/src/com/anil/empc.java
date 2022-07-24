import java.util.*;
class Employee
{
static Scanner sc=new Scanner(System.in);
int empid;
String empname;
double empsalary;
Employee(int empid,String empname,double empsalary)
{
this.empid=empid;
this.empname = empname;
this.empsalary = empsalary;
}
void display()
{
System.out.println("employee id:"+empid);
System.out.println("employee name:"+empname);
System.out.println("employee salary:"+empsalary);
}
public static void main(String[] args)
{
int eid=sc.nextInt();
String ename=sc.next();
double esalary=sc.nextDouble();
Employee e1=new Employee(eid,ename,esalary);
e1.display();
}
}
