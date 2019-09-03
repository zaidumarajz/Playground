import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,o=0,k=0,m=1,num=n,l,r=1;
      for(i=1;i<=n;i++)
      {
        for(int sp=1;sp<=o;sp++)
          System.out.print(" ");
        for(j=1;j<=2*n-k;j++)
        {
          if(j%2==1)
          {
            System.out.print(m);
            m++;
          }
          else
            System.out.print("*");
        }
        for(l=1;l<=2*n-k-1;l++)
        {
          if(l%2==1)
          {
            System.out.printf("%d",num*num+r);
            r++;
          }
          else
            System.out.print("*");
        }
        k=k+2;
        o=o+1;
        num=num-1;
        System.out.println("");
      }
	}
}