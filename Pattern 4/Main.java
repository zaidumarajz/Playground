import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,k;
      for(i=n;i>0;i--)
      {
        for(j=1,k=i;j<=n;j++)
        {
          System.out.print(k);
          if(k<n)
            k++;
        }
        System.out.println("");
      }
	}
}