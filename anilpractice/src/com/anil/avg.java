class Avg
{
public static void main(String[]anil)
{
int sum=0,c=0;
for(int i=24;i<=100;i++)
{
if(i%2==0)
{
sum=sum+i;
c++;
}
}
System.out.print(sum/c);
}
}