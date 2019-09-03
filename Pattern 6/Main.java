import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,k=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=2*i-1;j++)
        {
          System.out.print(k+" ");
          k++;
        }
        k=1;
        System.out.println("");
      }
	}
}