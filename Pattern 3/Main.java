import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,b,num=n,a=1;
      for(i=1;i<=n;i++)
      {
        b=a;
        for (j=1;j<=num;j++)
        {
          System.out.print(b+" ");
          b=b+2;
        }
        a=a+2;
        num=num-1;
        System.out.println("");
      }
	}
}