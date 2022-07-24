class Switch
{
static int a=76,b=56;
public static void main(String[]args)
{
int g=78,h=65;
Switch c=new Switch();
char ch='+';
switch(ch)
{
case '+':
System.out.print(c.a+c.b);
break;
case '-':
System.out.print(g-h);
break;
case '*':
System.out.print(g*h);
break;
}
}
}