class A
{
A(A a1)
{
System.out.print(a1);
}
A()
{
System.out.print("hlo");
}
public static void main(String[] args)
{
A a2=new A();
A obj=new A(a2);
}
}