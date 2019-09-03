import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int[][] a=new int[5][5];
      int n=s.nextInt();
      int i,j,f=0;
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          a[i][j]=s.nextInt();
        }
      }
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          if(j==i)
            continue;
          else
          {
            if(a[i][j]!=0)
            {
              f=1;
              break;
            }
          }
        }
      }
          if(f==0)
            System.out.println("yes");
          else
            System.out.println("no");
	}
}