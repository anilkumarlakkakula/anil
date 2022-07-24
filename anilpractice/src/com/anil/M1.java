import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int n = 0;
		int temp = 0;
		boolean length = true;
		while(length)
		{
			n = sc.nextInt();
			temp = n;
			int len =0;
			while(n>0)
			{
				int rev = n%10;
				n/=10;
				len++;
			}
			if(len>=4)
			{
				length=false;
			}
			else
				{
					System.out.println("number is less then 4 digits enter another number");
				}
		}
		n=temp;
		int c=0;
		int sum=0;
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