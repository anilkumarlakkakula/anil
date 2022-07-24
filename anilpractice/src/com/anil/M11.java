import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c=0;
        if(n<1000)
        {
            while(n<1000)
            {
                int a=sc.nextInt();
                n=a;
            }
             while(n>0)
            {
                int r=n%10;
                n=n/10;
                int pc=0;
                for(int i=1;i<=r;i++)
                {
                    if(r%i==0)
                    {
                        pc++;
                    }
                }
                if(pc==2)
                {
                    c++;
                    sum=sum+r;
                }
            }
            System.out.println(c);
            System.out.print(sum);
        } 
        else
        {
            while(n>0)
            {
                int r=n%10;
                n=n/10;
                int pc=0;
                for(int i=1;i<=r;i++)
                {
                    if(r%i==0)
                    {
                        pc++;
                    }
                }
                if(pc==2)
                {
                    c++;
                    sum=sum+r;
                }
            }
            System.out.println(c);
            System.out.print(sum);        
        }
    }
}