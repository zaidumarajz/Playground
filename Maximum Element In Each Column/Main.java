import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int[][] a=new int[10][10];
      int m=s.nextInt();
      int n=s.nextInt();
      int max=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j]=s.nextInt();
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(a[j][i]>max)
            max=a[j][i];
        }
        System.out.println(max);
        max=0;
      }
	}
}